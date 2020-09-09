package cla.edg.extfile.loader;

import cla.edg.extfile.pageflow.Node;
import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.LightXmlData;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public abstract class BaseNgmLoader {
    public List<Node> loadNodesFromFile(List<File> inputFiles) throws Exception {
        if (inputFiles == null || inputFiles.isEmpty()) {
            return new ArrayList<>();
        }
        List<Node> nodeList = new ArrayList<>();
        for(File file: inputFiles){
            List<Node> nodes = loadFromFile(file);
            nodeList.addAll(nodes);
        }
        return nodeList;
    }

    protected List<Node> loadFromFile(File file) throws Exception {
        List<String> fileContent = getFileContentFrom(file);
        List<String> decodedContent = new ArrayList<>();
        for (String str : fileContent) {
            decodedContent.add(decode(str));
        }
        Utils.debug("got content: " + decodedContent);
        List<Node> nodeList = new ArrayList<>();
        for (String str : decodedContent) {
            parseFromMxfileXml(nodeList, str);
        }
        return nodeList;
    }

    protected void parseFromMxfileXml(List<Node> nodeList, String str) throws Exception {
        List<LightXmlData> datas = new LightXmlData.Builder().fromXmlString(str).child("root").child("mxCell").getAll();
        for (LightXmlData data : datas) {
            Node n = createNodeFromXmlData(data, datas);
            nodeList.add(n);
        }
        // Utils.debug(Utils.toJson(nodeList, true));
    }

    protected Node createNodeFromXmlData(LightXmlData data, List<LightXmlData> allXmlDatas) throws Exception {
        Node node = new Node();
//        Utils.debug("createNodeFromXmlData(): " + Utils.toJson(data, true));
        node.setId((String) data.getAttributes().get("id"));
        node.setParent((String) data.getAttributes().get("parent"));
        node.setFromNode((String) data.getAttributes().get("source"));
        node.setToNode((String) data.getAttributes().get("target"));
        node.setNodeType(parseNodeType(data, allXmlDatas));
        node.setName(parseNodeName(data));
        node.setTitle(parseNodeTitle(data));
        return node;
    }

    protected String parseNodeTitle(LightXmlData data) {
        List<String> values = toStringList(data, "value");
        if (values == null || values.isEmpty()){
            return null;
        }
        return values.get(0);
    }

    protected String parseNodeName(LightXmlData data){
        List<String> values = toStringList(data, "value");
        if (values == null || values.isEmpty()){
            return null;
        }
        if (values.size() > 1){
            return values.get(1);
        }
        return null;
    }

    protected List<String> toStringList(LightXmlData data, String name){
       return toStringList(data, name, ";|\n|<br>");
    }
    protected List<String> toStringList(LightXmlData data, String name, String separator){
        Object o = data.getAttributes().get(name);
        if (o == null){
            return null;
        }
        List<String> x = Arrays.asList(o.toString().split(separator));
//        Utils.debug("split %s to %s", o, x);
        List<String> result = new ArrayList<>();
        for (String s : x) {
            if (Utils.isBlank(s)){
                result.add(null);
                continue;
            }
            result.add(s);
        }
        return result;
    }

    protected abstract String parseNodeType(LightXmlData data, List<LightXmlData> allXmlDatas) throws Exception;

    protected String decode(String input) throws Exception {
        byte[] base64Decodeed = Base64.getDecoder().decode(input);

        byte[] inflateArray = decompress(base64Decodeed);

        return URLDecoder.decode(new String(inflateArray, StandardCharsets.UTF_8), "UTF-8");
    }


    protected static byte[] decompress(byte[] input) throws DataFormatException {
        Inflater decompressor = new Inflater(true);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        decompressor.setInput(input, 0, input.length);
        byte[] result = new byte[1024];
        while(!decompressor.finished()){
            int resultLength = decompressor.inflate(result);
            bout.write(result, 0, resultLength);
        }
        decompressor.end();
        return bout.toByteArray();
    }
    protected abstract List<String> getFileContentFrom(File file) throws Exception;


}

package cla.edg.extfile.loader;

import clariones.tool.builder.Utils;
import clariones.tool.builder.utils.LightXmlData;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NutStoreNgmLoader extends BaseNgmLoader{
    protected List<String> getFileContentFrom(File file) throws Exception{
        String orgContent = Utils.readFileAsString(file, StandardCharsets.UTF_8);
//        Utils.debug("原始读取内容:" + orgContent);
        Pattern ptnContent = Pattern.compile("<diagram [^>]*>(.+?)</diagram>");
        Matcher matcher = ptnContent.matcher(orgContent);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group(1));
        }
//        Utils.debug("截取内容:" + list);
        return list;
    }

    protected String parseNodeType(LightXmlData data, List<LightXmlData> allXmlDatas) throws Exception{
        String type = parseSureNodeType(data);
        if (type != null){
            return type;
        }

        Object value = data.getAttributes().get("edge");
        if ("1".equals(value)){
            // 是条边, 可能是 request, 可能是 branch
            String fromId = (String) data.getAttributes().get("source");
            String toId = (String) data.getAttributes().get("target");
            String fromType = getReferredNodeType(allXmlDatas, fromId);
            String toType = getReferredNodeType(allXmlDatas, toId);
            if (fromType == null || toType == null){
                throw new Exception("连接的起/终点无法确定类型:"+Utils.toJson(data, true));
            }
            if (fromType.equals("page") && toType.equals("page")){
                return "request";
            }
            if (fromType.equals("request_point") && toType.equals("page")){
                return "branch";
            }
            if (fromType.equals("start_way") && toType.equals("page")){
                return "request";
            }
            if (fromType.equals("start_way") && toType.equals("request_point")){
                return "request";
            }
            if (fromType.equals("page") && toType.equals("request_point")){
                return "request";
            }
        }

        value = data.getAttributes().get("style");
        if (value != null && value.toString().startsWith("text;")){
            return "text";
        }

        return "没分析出来";

    }

    private String getReferredNodeType(List<LightXmlData> allXmlDatas, String id) {
        LightXmlData node = allXmlDatas.stream().filter(data -> id.equals(data.getAttributes().get("id"))).findFirst().orElse(null);
        if (node == null){
            return null;
        }
        return parseSureNodeType(node);
    }

    private String parseSureNodeType(LightXmlData node) {
        List<String> styleSegs = toStringList(node, "style");
        if (styleSegs != null ) {
            if (styleSegs.contains("shape=umlActor")) {
                return "start_way";
            }
            if (styleSegs.contains("shape=note")) {
                return "page";
            }
            if (styleSegs.contains("ellipse")) {
                return "request_point";
            }
        }


        return null;
    }
}

package cla.edg.extfile.test;

import cla.edg.extfile.element.BaseElement;
import cla.edg.extfile.loader.DCJsonLoader;
import cla.edg.extfile.loader.PageFlowScriptMaker;
import cla.edg.pageflow.PageFlowScript;
import clariones.tool.builder.Utils;

import java.io.File;
import java.util.List;
import java.util.Map;

public class DCJsonLoaderTest {
    public static void main(String[] args) throws Exception {
        String fileName = ".*page_[\\d_]+\\.json";
//        File baseFolder = new File("/works/jobs/project_script/workspace/project-script/projects/project_repairchain");
        File baseFolder = new File("/Users/clariones/Downloads");

        DCJsonLoader loader = new DCJsonLoader();
        loader.setInputFile(baseFolder, fileName);
        System.out.println("load file [" + loader.getInputFile().getAbsolutePath()+"]");

        Map<String, Map<String, BaseElement>> allElements = loader.doJob();
        Utils.debug(Utils.toJson(allElements));

        PageFlowScriptMaker maker = new PageFlowScriptMaker();
        PageFlowScript script = new PageFlowScript();
        script.setName("DC Json Loader Test");
        maker.processInputElements(allElements);
        maker.makeScript(script);
    }
}

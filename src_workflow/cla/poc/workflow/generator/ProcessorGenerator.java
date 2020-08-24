package cla.poc.workflow.generator;

import cla.poc.workflow.spec.ProcessingSpec;
import com.terapico.generator.BasicGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProcessorGenerator extends BasicGenerator {
    protected Map<String, ProcessingSpec> allSpec;
    protected String folderName;
    protected String basePackageName;

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getBasePackageName() {
        return basePackageName;
    }

    public void setBasePackageName(String basePackageName) {
        this.basePackageName = basePackageName;
    }

    public Map<String, ProcessingSpec> getAllSpec() {
        return allSpec;
    }
    public void setAllSpec(Map<String, ProcessingSpec> allSpec) {
        this.allSpec = allSpec;
    }

    @Override
    public List<GenrationResult> runJob() throws Exception {
        List<GenrationResult> resultList = new ArrayList<>(generateSpecJavaFile());
        resultList.add(generateBaseProcessorJavaFile());
        // resultList.add(generateChangeRequestXml());
        // resultList.add(generateTodoFile());
        return resultList;
    }

    private List<GenrationResult> generateSpecJavaFile() throws Exception {
        List<GenrationResult> resultList = new ArrayList<>();
        for(String processingName: allSpec.keySet()){
            String templatePath = "/wf_processor/process_spec.java.ftl";
            Map<String, Object> data = Utils.put("spec", allSpec.get(processingName))
                    .put("helper", new GenerationHelper())
                    .put("base_package", getBasePackageName())
                    .into_map();
            String fileName = this.toFileName(data,
                    folderName+"/${base_package?replace('.','/')}/${helper.NameAsThis(spec.name)?lower_case}/${helper.NameAsThis(spec.name)}ProcessSpec.java");
            resultList.add(doGeneration(data, templatePath, fileName).as_new_file().with_code("process_spec.java"));

            templatePath = "/wf_processor/base_xxx_processor.java.ftl";
            fileName = this.toFileName(data,
                    folderName+"/${base_package?replace('.','/')}/${helper.NameAsThis(spec.name)?lower_case}/Base${helper.NameAsThis(spec.name)}Processor.java");
            resultList.add(doGeneration(data, templatePath, fileName).as_new_file().with_code("base_xxx_processor.java"));
        }
        return resultList;
    }

    private GenrationResult generateBaseProcessorJavaFile() throws Exception {

        String templatePath = "/wf_processor/base_processor.java.ftl";
        Map<String, Object> data = Utils
                .put("helper", new GenerationHelper())
                .put("base_package", getBasePackageName())
                .into_map();
        String fileName = this.toFileName(data,
                folderName + "/${base_package?replace('.','/')}/BaseProcessor.java");
        return doGeneration(data, templatePath, fileName).as_new_file().with_code("base_processor.java");
    }
}

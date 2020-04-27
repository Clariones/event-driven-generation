package cla.initial.project.yrzx;

import com.google.gson.Gson;
import com.terapico.generator.BasicGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator extends BasicGenerator {
    @Override
    public List<GenrationResult> runJob() throws Exception {
        List<GenrationResult> result = new ArrayList<>();
        result.add(generateMethods());
        return result;
    }

    private GenrationResult generateMethods() throws Exception {
        Map<String, Object> runData = new HashMap<>();
        runData.put("helper", new GenerationHelper());
        runData.put("dataList", data.get("dataList"));

        String templatePath = "/initial/initialUtils.java.ftl";
        String fileName = "DataInitialUtil.java";
        return this.doGeneration(runData, templatePath, fileName).as_new_file().with_code("initialUtils");
    }

    protected Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static void main(String[] args) throws Exception {
        String dataFile = "/data.json";

        InputStream fileStream = Generator.class.getResourceAsStream(dataFile);
        InputStreamReader reader = new InputStreamReader(fileStream);
        Map<String, Object> data = new Gson().fromJson(reader, Map.class);
        fileStream.close();

        String tmp = Utils.toJson(data, true);
        // System.out.println(tmp);

        Generator generator = new Generator();
        generator.setData(data);
        List<GenrationResult> rstList = generator.runJob();

        rstList.forEach(rst->System.out.println(rst.getContent()));
    }
}

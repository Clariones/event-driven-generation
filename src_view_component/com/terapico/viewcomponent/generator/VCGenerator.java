package com.terapico.viewcomponent.generator;

import clariones.tool.builder.BaseGenerator;
import clariones.tool.builder.GenrationResult;
import clariones.tool.builder.Utils;
import com.terapico.viewcomponent.example.BaseViewComponent;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VCGenerator extends BaseGenerator {
    protected Map<String, List<Object>> allTask;
    public static void main(String[] args) throws Exception {
        Class[] clazzes = new Class[]{BaseViewComponent.class};
        VCGenerator testee = new VCGenerator();
        testee.allTask = new HashMap<>();

        for (Class clazz : clazzes) {
            testee.allTask.put(clazz.getName(), new ArrayList<>());
            testee.prepareTasks(clazz);
        }

        testee.generate();
    }

    protected void generate() throws Exception {
        allTask.forEach((name, task)->{
            try {
                GenrationResult rst = doGeneration(Utils.put("name", name).put("tasks", task).put("helper", new Utils()).into_map(),
                        "viewcomponent/VC.java.ftl", "1.out");
                System.out.println(rst.getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
    private void prepareTasks(Class clazz) {
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            Utils.debug("处理%s.%s", clazz.getSimpleName(), field.getName());
            if (List.class.isAssignableFrom(field.getType())){
                genList(clazz, field);
                continue;
            }
            if (Map.class.isAssignableFrom(field.getType())){
                genMap(clazz, field);
                continue;
            }
            genSimpleField(clazz, field);
        }


    }

    private  void genSimpleField(Class clazz, Field field) {
        Map<String, Object> data = Utils.put("fieldName", field.getName())
                .put("type", simpleName(field.getType().getName()))
                .put("template", "field_simple.java.ftl")
                .into_map();
        allTask.get(clazz.getName()).add(data);
    }

    private String simpleName(String name) {
        return name.substring(name.lastIndexOf(".")+1);
    }

    private  void genMap(Class clazz, Field field) {
        ParameterizedType type = (ParameterizedType) field.getGenericType();
        Map<String, Object> data = Utils.put("fieldName", field.getName())
                .put("type", simpleName(type.getActualTypeArguments()[1].getTypeName()))
                .put("template", "field_map.java.ftl")
                .into_map();
        allTask.get(clazz.getName()).add(data);
    }

    private  void genList(Class clazz, Field field) {
        ParameterizedType type = (ParameterizedType) field.getGenericType();
        Map<String, Object> data = Utils.put("fieldName", field.getName())
                .put("type", simpleName(type.getActualTypeArguments()[0].getTypeName()))
                .put("template", "field_list.java.ftl")
                .into_map();
        allTask.get(clazz.getName()).add(data);
    }

    @Override
    public List<GenrationResult> runJob() throws Exception {
        return null;
    }
}

package cla.initial.project.yrzx;

import com.terapico.generator.BaseHelper;

public class GenerationHelper extends BaseHelper {
    public boolean isFunction(String name){
        return name.matches("^.*\\(.*\\)$");
    }
    public String getFunctionName(String name) {
        int pos = name.indexOf("(");
        return name.substring(0, pos);
    }
}

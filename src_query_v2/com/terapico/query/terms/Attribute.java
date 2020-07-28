package com.terapico.query.terms;

import com.terapico.datatype.BasicType;

public class Attribute {
    protected String name;  // 属性的名字
    protected BasicType type;   // 属性的基础类型
    protected Object minRangeValue; // 最大值
    protected Object maxRangeValue; // 最小值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicType getType() {
        return type;
    }

    public void setType(BasicType type) {
        this.type = type;
    }

    public Object getMinRangeValue() {
        return minRangeValue;
    }

    public void setMinRangeValue(Object minRangeValue) {
        this.minRangeValue = minRangeValue;
    }

    public Object getMaxRangeValue() {
        return maxRangeValue;
    }

    public void setMaxRangeValue(Object maxRangeValue) {
        this.maxRangeValue = maxRangeValue;
    }
}

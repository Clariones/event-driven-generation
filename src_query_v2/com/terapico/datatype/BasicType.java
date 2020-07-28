package com.terapico.datatype;

public enum BasicType {
    COMMON_STRING(UnderlyingType.STRING_TYPE, "string", 0, 200),
    DATE_TIME(UnderlyingType.DATETIME_TYPE, "datetime", "1970-1-1 00:00:00", "2099-12-31 23:59:59");




    protected UnderlyingType underlyingType;
    protected Object defaultMinRange;
    protected Object defaultMaxRange;
    protected String standardName;
    protected String refModelName;

    BasicType(UnderlyingType uType, String name, Object defMin, Object defMax){
        underlyingType = uType;
        standardName = name;
        defaultMinRange = defMin;
        defaultMaxRange = defMax;
    }
    public BasicType modelName(String modelName){
        refModelName = modelName;
        return this;
    }
}

package com.terapico.changerequest.builder;

import clariones.tool.builder.Utils;
import com.terapico.changerequest.spec.FieldSpec;

import java.lang.reflect.Field;

/**
 * 规格中只需要描述必要的信息,其他信息如果可以简单的推断出来, 就不用写.
 */
public class FieldPropertyAnalyzer {

    public void process(FieldSpec field) {
        processBasicProperty(field);
        processBackEndDataTypeProperty(field);
        processFrontEndProperty(field);
    }




    /** 先处理基础字段
     * 名字, 中文等
     */
    private void processBasicProperty(FieldSpec field) {
        if (Utils.isBlank(field.getName())){
            Utils.error("字段 %s 定义时没有名字", field.getTitle());
        }
        if (Utils.isBlank(field.getTitle())){
            field.setTitle(Utils.upperCaseEachWord(field.getName()));
        }
    }

    /**
     * 处理字段在后台对应的数据类型等属性
     * 类型, 类型相关
     */
    private void processBackEndDataTypeProperty(FieldSpec field) {
        // 暂时不用sample data作为输入
        // 1. 先推断类型
        if (field.getInputType() == null){
            parseFieldInputType(field);
        }
        if (field.getInputType().equals(FieldType.BASE_ENTITY) && field.getModelName() == null){
            Utils.error("定义字段 %s:%s 时没有指定类型名字", field.getName(), field.getTitle());
        }
        // 2. 再推断长度
        if (field.getRangeArgs() == null){
            parseFieldRange(field);
        }
    }




    /**
     * 处理前端要用的几个属性
     */
    private void processFrontEndProperty(FieldSpec field) {
        // ui style
        if (field.getUiStyle() == null){
            parseUiStyle(field);
        }
    }

    private void parseFieldInputType(FieldSpec field) {
        if (field.getUiStyle() != null){
            field.setInputType(field.getUiStyle().getDefaultFieldType());
        }else{
            field.setInputType(FieldType.TEXT);
        }
    }
    private void parseFieldRange(FieldSpec field) {
        if (field.getUiStyle() != null){
            field.setRangeArgs(field.getUiStyle().getDefaultRange());
        }
        if (field.getRangeArgs() == null){
            field.setRangeArgs(field.getInputType().getDefaultRange());
        }
    }

    private void parseUiStyle(FieldSpec field) {
        if (field.getSelectable() != null && field.getSelectable().booleanValue()){
            if (field.getMultiSelection() == null || !field.getMultiSelection()){
                field.setUiStyle(UIStyle.INPUT_SINGLE_SELECT);
            }else{
                field.setUiStyle(UIStyle.INPUT_MULTI_SELECT);
            }
            return;
        }
        if (field.getInputType() != null){
            field.setUiStyle(field.getInputType().getDefaultUiStyle());
        }
    }

}

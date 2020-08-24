package com.terapico.query.utils;

import builder.Utils;

import java.util.Collection;

public class CollectionUtil {
    public static void assertSize(Collection<?> collection, int size) {
        if (size == 0){
            if (collection == null){
                return;
            }
            if (collection.isEmpty()){
                return;
            }
            Utils.error("给定的集合不是空");
            return;
        }
        if (collection == null) {
            Utils.error("给定的集合是空,期望有"+size+"个元素");
            return;
        }
        if (collection.size() != size){
            Utils.error("给定的集合有"+collection.size()+"个元素,期望有"+size+"个元素");
        }
    }
}

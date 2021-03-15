package com.terapico.query.utils;

import cla.edg.modelbean.LogicalOperator;

public class SqlKeys {
    public static String convertCollectionType(LogicalOperator.CollectionType collectionType, boolean bFirst) {
        switch (collectionType){
            case and:
                return bFirst?"":"AND";
            case or:
                return bFirst?"":"OR";
            case not:
                return bFirst?"NOT ":"NOT";
            case exists:
                return bFirst?"EXISTS ":"EXISTS";
            case not_exists:
                return bFirst?"NOT EXISTS ":"NOT EXISTS";
            default:
                throw new RuntimeException("CollectionType又增加了"+collectionType+"还没处理哦");
        }
    }
}

package com.terapico.query.builder;

import cla.edg.modelbeanv2.LogicalOperator;

public class QueryBuilderV2 {
    protected LogicalOperator whereClause;

    public LogicalOperator getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(LogicalOperator whereClause) {
        this.whereClause = whereClause;
    }
    //// //////////////////////////////////////

    public QueryBuilderV2 where(LogicalOperator ... operators) {
        if (operators == null || operators.length == 0) {
            return this;
        }
        if (operators.length == 1){
            setWhereClause(operators[0]);
            return this;
        }
        setWhereClause(LogicalOperator.create(LogicalOperator.CollectionType.and, operators));
        return this;
    }
}

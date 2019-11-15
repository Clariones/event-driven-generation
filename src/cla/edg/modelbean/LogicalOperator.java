package cla.edg.modelbean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cla.edg.Utils;

public class LogicalOperator {
	public static Set<String> needKnownClasses = new HashSet<>();
	public enum Operator {
		eq,not,less_or_eq,bigger_or_eq,less,bigger,in,not_in,is_null,not_null
	}
	public enum CollectionType {
		and, or
	}
	
	
	protected CollectionType collectionType = CollectionType.and;
	protected List<LogicalOperator> operations = new ArrayList<>();
	public CollectionType getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(CollectionType collectionType) {
		this.collectionType = collectionType;
	}
	public List<LogicalOperator> getOperations() {
		return operations;
	}
	public void setOperations(List<LogicalOperator> operations) {
		this.operations = operations;
	}
	
	protected Operator operator;
	protected Object op1;
	protected Object op2;
	
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Object getOp1() {
		return op1;
	}
	public void setOp1(Object op1) {
		this.op1 = op1;
	}
	public Object getOp2() {
		return op2;
	}
	public void setOp2(Object op2) {
		this.op2 = op2;
	}
	public LogicalOperator and (LogicalOperator ... operations) {
		this.setCollectionType(CollectionType.and);
		getOperations().addAll(Arrays.asList(operations));
		return this;
	}
	public LogicalOperator or (LogicalOperator ... operations) {
		this.setCollectionType(CollectionType.and);
		getOperations().addAll(Arrays.asList(operations));
		return this;
	}
	
	public static LogicalOperator create(Operator opr, Object op1, Object op2) {
		LogicalOperator result = new LogicalOperator();
		result.setOp1(op1);
		result.setOp2(op2);
		result.setOperator(opr);
		
		List<Object> listOp2 = Utils.convertToList(op2);
		listOp2.forEach(data -> {
			if (data instanceof EnumAttribute) {
				needKnownClasses.add(((EnumAttribute) data).getClassName());
			}
		});
		return result;
	}
	
}

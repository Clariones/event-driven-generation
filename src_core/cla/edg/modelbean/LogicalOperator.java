package cla.edg.modelbean;

import java.util.*;

public class LogicalOperator {
	private final String declaredPosition;

	public String getDeclaredPosition() {
		return declaredPosition;
	}

	public LogicalOperator(){
		super();
		StackTraceElement st = new Throwable().getStackTrace()[3];
		declaredPosition = st.getFileName()+":"+st.getLineNumber();
	}
	public enum Operator {
		like,eq,not,less_or_eq,bigger_or_eq,less,bigger,in,not_in,is_null,not_null
	}
	public enum CollectionType {
		and, or
	}

	protected List<Object> operandList;
	protected CollectionType collectionType = CollectionType.and;
	protected Operator operator;
	protected boolean optional = false;

	public List<Object> getOperandList() {
		return operandList;
	}

	public void setOperandList(List<Object> operandList) {
		this.operandList = operandList;
	}

	public CollectionType getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(CollectionType collectionType) {
		this.collectionType = collectionType;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	/////////// **
	//////////////


	public LogicalOperator optional() {
		this.setOptional(true);
		return this;
	}


	public LogicalOperator and (LogicalOperator... operations) {
		if (CollectionType.and.equals(this.getCollectionType())) {
			this.getOperandList().addAll(Arrays.asList(operations));
			return this;
		}
		LogicalOperator result = new LogicalOperator();
		result.setOperandList(new ArrayList<>());
		result.getOperandList().add(this);
		result.getOperandList().addAll(Arrays.asList(operations));
		result.setCollectionType(CollectionType.and);
		result.setOperator(null);
		return result;
	}
	public LogicalOperator or (LogicalOperator... operations) {
		if (CollectionType.or.equals(this.getCollectionType())) {
			this.getOperandList().addAll(Arrays.asList(operations));
			return this;
		}
		LogicalOperator result = new LogicalOperator();
		result.setOperandList(new ArrayList<>());
		result.getOperandList().add(this);
		result.getOperandList().addAll(Arrays.asList(operations));
		result.setCollectionType(CollectionType.or);
		result.setOperator(null);
		return result;
	}

	
	public static LogicalOperator create(Operator opr, Object ... ops) {
		LogicalOperator result = new LogicalOperator();
		result.setOperandList(new ArrayList<>());
		result.getOperandList().addAll(asList(ops));
		result.setOperator(opr);
		result.setCollectionType(null);
		return result;
	}

	public static LogicalOperator create(CollectionType opr, LogicalOperator ... ops) {
		LogicalOperator result = new LogicalOperator();
		result.setOperandList(new ArrayList<>());
		result.getOperandList().addAll(asList(ops));
		result.setOperator(null);
		result.setCollectionType(opr);
		return result;
	}

	private static List<?> asList(Object[] ops) {
		if (ops == null || ops.length == 0){
			return new ArrayList<>();
		}
		if (ops.length == 1 && ops[0] == null){
			return new ArrayList<>();
		}
		if (ops.length == 1 && ops[0] instanceof List){
			return (List<?>) ops[0];
		}
		if (ops.length == 1 && ops[0].getClass().isArray()){
			return Arrays.asList((Object[])ops[0]);
		}
		if (ops.length == 1){
			return Collections.singletonList(ops[0]);
		}
		List<Object> result = new ArrayList<>();
		for (Object op : ops) {
			if (op == null){
				result.add(op);
				continue;
			}
			if (op.getClass().isArray()){
				result.addAll(Arrays.asList((Object[])op));
				continue;
			}
			result.add(op);
		}
		return result;
	}

}

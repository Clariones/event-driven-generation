package cla.edg.modelbean;

public class EnumAttribute {
	protected String className;
	protected String literalName;
	protected String chineseName;
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getLiteralName() {
		return literalName;
	}

	public void setLiteralName(String literalName) {
		this.literalName = literalName;
	}

	public EnumAttribute(String fullClassName, String literalName) {
		setClassName(fullClassName);
		setLiteralName(literalName);
	}

	public String getConstantsName() {
		int pos = className.lastIndexOf('.');
		return className.substring(pos+1)+"."+literalName;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public EnumAttribute chineseName(String chineseNam){
		setChineseName(chineseNam);
		return this;
	}
}

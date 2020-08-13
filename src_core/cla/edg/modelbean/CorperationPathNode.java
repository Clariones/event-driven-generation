package cla.edg.modelbean;

public class CorperationPathNode {
	protected String key;
	protected BaseModelBean fromBean;
	protected BaseModelBean toBean;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public BaseModelBean getFromBean() {
		return fromBean;
	}
	public void setFromBean(BaseModelBean fromBean) {
		this.fromBean = fromBean;
	}
	public BaseModelBean getToBean() {
		return toBean;
	}
	public void setToBean(BaseModelBean toBean) {
		this.toBean = toBean;
	}
	public static String keyOf(BaseModelBean from, BaseModelBean to) {
		if (to.isReferDirection()) {
			return String.format("%s-[%s]-%s", from.getModelTypeName(), to.getName().toUpperCase(), to.getModelTypeName());
		}else {
			return String.format("%s-[%s]-%s", to.getModelTypeName(), to.getName().toUpperCase(), from.getModelTypeName());
		}
	}
	
	
}

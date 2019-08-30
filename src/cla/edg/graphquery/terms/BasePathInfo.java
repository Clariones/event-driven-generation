package cla.edg.graphquery.terms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BasePathInfo {
	/** has_a, 例如 Project.projectOwner 就是Project中引用一个Merchant */
	public static final String HAS_A = "has_a";
	/** has_list, 例如 Merchant.projectListAsStore, 就是Merchant中有很多个Project */
	public static final String HAS_LIST = "has_list";
	
	protected String fromClass;
	protected String toClass;
	protected String memberName;
	protected String referAsMemberName;
	protected String relationType;
	
	protected List<BasePathInfo> priorPaths;
	protected List<BasePathInfo> nextPaths;
	
	protected transient List<BasePathInfo> actForPaths;
	
	protected transient Map<String, BasePathInfo> allPaths;
	
	public Map<String, BasePathInfo> getAllPaths() {
		if (allPaths == null) {
			allPaths = new HashMap<>();
			allPaths.put(getPathKey(this), this);
		}
		return allPaths;
	}
	
	public void setAllPaths(Map<String, BasePathInfo> allPaths) {
		this.allPaths = allPaths;
	}
	
	public List<BasePathInfo> getActForPaths() {
		if (actForPaths == null) {
			actForPaths = new LinkedList<>();
		}
		return actForPaths;
	}
	public void setActForPaths(List<BasePathInfo> actForPaths) {
		this.actForPaths = actForPaths;
	}
	public List<BasePathInfo> getPriorPaths() {
		if (priorPaths == null) {
			priorPaths = new LinkedList<>();
		}
		return priorPaths;
	}
	public void setPriorPaths(List<BasePathInfo> priorPaths) {
		this.priorPaths = priorPaths;
	}
	public List<BasePathInfo> getNextPaths() {
		if (nextPaths == null) {
			nextPaths = new LinkedList<>();
		}
		return nextPaths;
	}
	public void setNextPaths(List<BasePathInfo> nextPaths) {
		this.nextPaths = nextPaths;
	}
	public String getFromClass() {
		return fromClass;
	}
	public void setFromClass(String fromClass) {
		this.fromClass = fromClass;
	}
	public String getToClass() {
		return toClass;
	}
	public void setToClass(String toClass) {
		this.toClass = toClass;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getReferAsMemberName() {
		return referAsMemberName;
	}
	public void setReferAsMemberName(String referMemberName) {
		this.referAsMemberName = referMemberName;
	}
	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getEdgeName() {
		if (HAS_A.equals(this.getRelationType())) {
			return this.getFromClass()+"$"+this.getMemberName();
		}
		return this.getToClass()+"$"+this.getReferAsMemberName();
	}
	/////////// 方案1 用图, 节点是类型, 关系是边 和数据库概念一致
	protected void appendPath(BasePathInfo newPath) {
		Map<String, BasePathInfo> allExisted = this.getAllPaths();
		Map<String, BasePathInfo> newAdded = newPath.getAllPaths();
		allExisted.putAll(newAdded);
		newPath.setAllPaths(allExisted);
//		System.out.println(allExisted);
	}
	protected void actFor(BasePathInfo newPath) {
		this.getActForPaths().add(newPath);
	}
	private String getPathKey(BasePathInfo basePathInfo) {
		if (HAS_A.equals(this.getRelationType())) {
			return String.format("%s--(%s)->%s",
					this.getFromClass(), this.getMemberName(), this.getToClass());
		}
		return String.format("%s--(%s)->%s",
				this.getToClass(), this.getReferAsMemberName(), this.getFromClass());
	}


//////////  方案2, 用关系的链表, 暂时没做
//	protected void appendPath(BasePathInfo newPath) {
//		// TODO Auto-generated method stub
//		
//	}
//	protected void actFor(BasePathInfo newPath) {
//		this.getActForPaths().add(newPath);
//	}
//////////方案2, 用关系的链表, 暂时没做
	
	public <T extends BasePathInfo> T addPaths(T p1, T[] paths) {
		appendPath(p1);
		if (paths != null) {
			for(T path: paths) {
				appendPath(path);
				p1.actFor(path);
			}
		}
		return p1;
	}
	
	
	public <T extends BasePathInfo> T next(T nextPath){
		appendPath(nextPath);
		return nextPath;
	}

	@Override
	public String toString() {
		return "BasePathInfo [fromClass=" + fromClass + ", toClass=" + toClass + ", memberName=" + memberName
				+ ", referAsMemberName=" + referAsMemberName + ", relationType=" + relationType + "]";
	}
	
	
}

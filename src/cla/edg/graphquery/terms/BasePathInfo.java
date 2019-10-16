package cla.edg.graphquery.terms;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
	
	protected List<PathInfoV2> pathOfMine;
	
	public List<PathInfoV2> getPathOfMine() {
		if (pathOfMine == null) {
			pathOfMine = new LinkedList<>();
			PathInfoV2  firstStep = new PathInfoV2();
			pathOfMine.add(firstStep);
			firstStep.setFromNode(new NodeInPathV2(this.getFromClass()));
			firstStep.setToNode(new NodeInPathV2(this.getToClass()));
			firstStep.setEdge(this);
		}
		return pathOfMine;
	}

	public void setPathOfMine(List<PathInfoV2> pathOfMine) {
		this.pathOfMine = pathOfMine;
	}

//	protected transient List<BasePathInfo> actForPaths;
//	
//	protected transient Map<String, BasePathInfo> allPaths;
	
//	public Map<String, BasePathInfo> getAllPaths() {
//		if (allPaths == null) {
//			allPaths = new HashMap<>();
//			allPaths.put(this.getPathKey(), this);
//		}
//		return allPaths;
//	}
//	
//	public void setAllPaths(Map<String, BasePathInfo> allPaths) {
//		this.allPaths = allPaths;
//	}
//	
//	public List<BasePathInfo> getActForPaths() {
//		if (actForPaths == null) {
//			actForPaths = new LinkedList<>();
//		}
//		return actForPaths;
//	}
//	public void setActForPaths(List<BasePathInfo> actForPaths) {
//		this.actForPaths = actForPaths;
//	}
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

	public String getPathKey() {
		// 不同方向的是不同的path
		return String.format("[%s]-%s-[%s]", this.getFromClass(), this.getMemberName(), this.getToClass());
	}


	public <T extends BasePathInfo> T then(T p1, T... paths) {
		return addPaths(p1, paths);
	}
	public <T extends BasePathInfo> T addPaths(T p1, T... paths) {
		List<T> list = new LinkedList<>();
		list.add(p1);
		if (paths != null && paths.length > 0) {
			list.addAll(Arrays.asList(paths));
		}
		appendPaths((List<BasePathInfo>) list);
		return p1;
	}
	

	public void appendPaths(List<BasePathInfo> list) {
		if (list == null || list.isEmpty()) {
			return;
		}
		// 首先检查, 所有新追加的path的起点类型是一致的, 我的所有终点的类型是一致的
		Set<String> newStartNodeClassNames = list.stream().map(it->it.getStartClassName()).collect(Collectors.toSet());
		if (newStartNodeClassNames.size() > 1) {
			throw new RuntimeException("要向一段路径追加多个新路径, 新路径的起点必须一致");
		}
		Set<NodeInPathV2> starts = new HashSet<>();
		Set<NodeInPathV2> ends = new HashSet<>();
		findStartAndEndNodes(starts, ends);
		
		if (starts.size() != 1) {
			throw new RuntimeException("当前路径信息有超过1个起点");
		}
		if (ends.size() !=1 ) {
			throw new RuntimeException("当前路径信息有超过1个终点, 无法确定用哪个和新路径连接");
		}
		NodeInPathV2 mineEndNode = ends.iterator().next();
		
		String curEndTypeName = ends.iterator().next().getNodeType();
		String newStartTypeName = newStartNodeClassNames.iterator().next();
		if (!curEndTypeName.equals(newStartTypeName)) {
			throw new RuntimeException("当前路径信息终点类型" + curEndTypeName + ", 无法和新路径起点" + newStartTypeName + "连接");
		}
		
		LinkedList<PathInfoV2> finalList = new LinkedList<>(this.getPathOfMine());
		
		// 检查都过了, 可以开始了
		NodeInPathV2 allEndNode = null;
		for(BasePathInfo newPath: list) {
			List<PathInfoV2> newInputPath = newPath.getPathOfMine();
			// 把newInputPath里的所有起点, 替换成当前的终点
			starts = new HashSet<>();
			ends = new HashSet<>();
			newPath.findStartAndEndNodes(starts, ends);
			NodeInPathV2 inputStartNode = starts.iterator().next();
			for (PathInfoV2 p : newInputPath) {
				if (p.getFromNode() == inputStartNode) {
					p.setFromNode(mineEndNode);
				}
			}
			// 再把所有的终点, 合并成一个, 如果可能的话
			if (ends.stream().map(it->it.getNodeType()).collect(Collectors.toSet()).size() == 1) {
				NodeInPathV2 pubEndNode = ends.iterator().next();
				if (allEndNode == null) {
					allEndNode = pubEndNode;
				}else {
					if (pubEndNode.getNodeType().equals(allEndNode.getNodeType())) {
						pubEndNode = allEndNode;
					}
				}
				for (PathInfoV2 p : newInputPath) {
					if (ends.contains(p.getToNode())) {
						p.setToNode(pubEndNode);
					}
				}
			}
			// 然后把我的节点全部加到新的路径上去
			finalList.addAll(newPath.getPathOfMine());
			newPath.setPathOfMine(finalList);
		}
		
	}

	public void findStartAndEndNodes(Set<NodeInPathV2> starts, Set<NodeInPathV2> ends) {
		Set<NodeInPathV2> maybeStarts = getPathOfMine().stream().map(it->it.getFromNode()).collect(Collectors.toSet());
		Set<NodeInPathV2> maybeEnds = getPathOfMine().stream().map(it->it.getToNode()).collect(Collectors.toSet());
		
		starts.addAll(maybeStarts);
		starts.removeAll(maybeEnds);
		ends.addAll(maybeEnds);
		ends.removeAll(maybeStarts);
	}

	public <T extends BasePathInfo> T next(T nextPath){
		appendPaths(Arrays.asList(new BasePathInfo[] {nextPath}));
		return nextPath;
	}

	@Override
	public String toString() {
		return this.getPathKey();
	}
	
	public String getStartClassName() {
		Set<NodeInPathV2> s = new HashSet<>();
		Set<NodeInPathV2> e = new HashSet<>();
		findStartAndEndNodes(s, e);
		if (s.size() > 1) {
			throw new RuntimeException("当前路径信息有超过1个起点");
		}
		return s.iterator().next().getNodeType();
	}
	public BasePathInfo getStartEdge() {
		Set<NodeInPathV2> s = new HashSet<>();
		Set<NodeInPathV2> e = new HashSet<>();
		findStartAndEndNodes(s, e);
		if (s.size() > 1) {
			throw new RuntimeException("当前路径信息有超过1个起点");
		}
		List<PathInfoV2> list = this.getPathOfMine();
		for(PathInfoV2 p : list) {
			if (s.contains(p.getFromNode())) {
				return p.getEdge();
			}
		}
		return null;
	}

	public List<PathInfoV2> findNextPath(PathInfoV2 pInfo) {
		return this.getPathOfMine().stream().filter(it->it.getFromNode() == pInfo.getToNode()).collect(Collectors.toList());
	}
	
}

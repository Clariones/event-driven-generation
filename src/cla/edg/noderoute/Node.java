package cla.edg.noderoute;

import java.util.ArrayList;
import java.util.List;

public class Node<N, E> {
	protected transient N data;
	protected String key;
	protected List<MeetingPoint<N,E>> meetingPointList;
	protected List<Node<N, E>> mirrorNodes;
	public N getData() {
		return data;
	}
	public void setData(N data) {
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<MeetingPoint<N, E>> getMeetingPointList() {
		return meetingPointList;
	}
	public void setMeetingPointList(List<MeetingPoint<N, E>> meetingPointList) {
		this.meetingPointList = meetingPointList;
	}
	public List<Node<N, E>> getMirrorNodes() {
		return mirrorNodes;
	}
	public void setMirrorNodes(List<Node<N, E>> mirrorNodes) {
		this.mirrorNodes = mirrorNodes;
	}
	
	// /////////////////////////////////////////////////////////////////////////////////////////////////////
	public static<N,E> Node<N, E> create(N nodeData) {
		Node<N, E> node = new Node<N, E>();
		node.setData(nodeData);
		node.setKey(RouteUtil.getKey(nodeData));
		node.setMeetingPointList(new ArrayList<>());
		node.setMirrorNodes(new ArrayList<>());
		return node;
	}
	public void addMeetingPoint(MeetingPoint<N, E> point) {
		this.getMeetingPointList().add(point);
	}
	
	
}

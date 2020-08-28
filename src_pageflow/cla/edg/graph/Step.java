package cla.edg.graph;

import java.util.ArrayList;
import java.util.List;

public class Step<N,E> {
	protected Edge<N,E> walkedEdge;
	protected transient Step<N,E> previousStep;
	protected List<Step<N,E>> continuedSteps;
	public Edge<N, E> getWalkedEdge() {
		return walkedEdge;
	}
	public void setWalkedEdge(Edge<N, E> walkedEdge) {
		this.walkedEdge = walkedEdge;
	}
	public Step<N, E> getPreviousStep() {
		return previousStep;
	}
	public void setPreviousStep(Step<N, E> previousStep) {
		this.previousStep = previousStep;
	}
	public List<Step<N, E>> getContinuedSteps() {
		return continuedSteps;
	}
	public void setContinuedSteps(List<Step<N, E>> continuedSteps) {
		this.continuedSteps = continuedSteps;
	}
	
	public void addContinuedStep(Step<N, E> step) {
		ensureContinuedSteps();
		continuedSteps.add(step);
	}
	private void ensureContinuedSteps() {
		if (continuedSteps != null) {
			return;
		}
		continuedSteps = new ArrayList<>();
	}
	
	
}

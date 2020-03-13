package com.terapico.changerequest.spec;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ChangeRequestSpec extends CommonSpec<ChangeRequestSpec>{
	protected static final Comparator<StepSpec> defaultComparator = new Comparator<StepSpec>() {
		public int compare(StepSpec o1, StepSpec o2) {
			return o1.getIndex() - o2.getIndex();
		}
	};
	
	protected List<StepSpec> stepSpecs;
	protected String requestUrlPrefix;

	public List<StepSpec> getStepSpecs() {
		return stepSpecs;
	}
	public void setStepSpecs(List<StepSpec> stepSpes) {
		this.stepSpecs = stepSpes;
	}

	public ChangeRequestSpec withRequestUrlPrefix(String urlPrefix) {
		this.setRequestUrlPrefix(urlPrefix);
		return this;
	}
	
	
	public String getRequestUrlPrefix() {
		return requestUrlPrefix;
	}
	public void setRequestUrlPrefix(String requestUrlPrefix) {
		this.requestUrlPrefix = requestUrlPrefix;
	}
	protected List<StepSpec> ensureStepSpecs(){
		if (stepSpecs != null) {
			return stepSpecs;
		}
		return stepSpecs = new LinkedList<>();
	}
	protected void resortStpeSpecs() {
		stepSpecs.sort(defaultComparator);
	}
	
	
	public void addStep(StepSpec stepSpec) {
		ensureStepSpecs().add(stepSpec);
		resortStpeSpecs();
	}

	@Override
	public String getSpecType() {
		return "ChangeRequest";
	}

	

	
	
	
	
}

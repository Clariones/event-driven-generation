package com.terapico.changerequest;

import java.io.File;
import java.util.List;

import com.terapico.changerequest.generator.ChangeRequestGenerator;

import cla.edg.actionpattern.GenrationResult;

public class GenerationJobExample {
	public static void main(String[] args) throws Exception {
		ChangeRequestGenerator generator = new ChangeRequestGenerator();
		generator.setChangeRequestSpec(new Example().scriptExampe());
		generator.setProjectName("jingou");
		generator.setOrgName("recycleSupplyChain");
		List<GenrationResult> files = generator.runJob();
		
		String outputFolder = "/works/jobs/front_end_poc/workspace/jingou-biz-suite/bizcore/GEN-CODE";
		generator.saveToFiles(new File(outputFolder), files);
	}
}

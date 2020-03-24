package com.terapico.changerequest;

import java.io.File;
import java.util.List;

import com.terapico.changerequest.generator.ChangeRequestGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

public class GenerationJobExample {
	public static void main(String[] args) throws Exception {
		ChangeRequestGenerator generator = new ChangeRequestGenerator();
		generator.setChangeRequestSpec(new Example().scriptExampe());
		generator.setProjectName("jingou");
		generator.setOrgName("recycleSupplyChain");
		List<GenrationResult> files = generator.runJob();
		
		String outputFolder = "/works/jobs/front_end_poc/workspace/jingou-biz-suite/bizcore/GEN-CODE";
		String crXmlOutputFolder = "/works/jobs/front_end_poc/workspace/web-code-generator/sky";
		generator.saveToFiles( Utils.put("ALL", new File(outputFolder))
				.put("changeRequest.xml", new File(crXmlOutputFolder)).into_map(File.class), files); // "changeRequest.xml"
	}
}

package com.terapico.changerequest;

import java.util.List;

import com.terapico.changerequest.generator.ChangeRequestGenerator;

import cla.edg.actionpattern.GenrationResult;

public class GenerationJobExample {
	public static void main(String[] args) throws Exception {
		ChangeRequestGenerator generator = new ChangeRequestGenerator();
		generator.setChangeRequestSpec(new Example().scriptExampe());
		generator.setProjectName("crExample");
		generator.setOrgName("skynet");
		List<GenrationResult> files = generator.runJob();
		files.forEach(file->{
			System.out.println(file.getFileName());
			System.out.println(file.getActionCode());
			System.out.println(file.getContent());
		});
	}
}

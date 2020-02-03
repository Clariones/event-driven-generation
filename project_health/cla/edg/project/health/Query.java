package cla.edg.project.health;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.health.gen.graphquery.MODEL;

public class Query extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script

				.find(MODEL.studentHealthSurvey().getModelTypeName())
					.which("student by survey id")
					.with_string("survey id")
					.with_string("user id")
					
					.do_it_as()
					.where(MODEL.studentHealthSurvey().classDailyHealthSurvey().eq("${survey id}"),
							MODEL.studentHealthSurvey().student().user().eq("${user id}"))
					.wants(MODEL.studentHealthSurvey().studentDailyAnswerList(),MODEL.studentHealthSurvey().studentDailyAnswerList().question())

				.find(MODEL.student().getModelTypeName()).which("name is").with_string("student name").with_string("user id")
					.do_it_as()
					.where(MODEL.student().studentName().eq("${student name}"),MODEL.student().user().eq("${user id}"))
					
				.query(MODEL.studentHealthSurvey()).which("is submitted by teacher id").with_string("teacher id")
					.do_it_as()
					.where(MODEL.studentHealthSurvey().teacher().eq("${teacher id}"),MODEL.studentHealthSurvey().surveyStatus().eq(MODEL.surveyStatus().SUBMITTE))
		;

	}
}

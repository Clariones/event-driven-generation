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
							MODEL.studentHealthSurvey().student().user().eq("${user id}"),
							MODEL.studentHealthSurvey().surveyStatus().eq(MODEL.surveyStatus().UN_SUBMITTED))
					.wants(MODEL.studentHealthSurvey().studentDailyAnswerList(),MODEL.studentHealthSurvey().studentDailyAnswerList().question())
					
				.find(MODEL.studentHealthSurvey().getModelTypeName())
					.which("is submitted by student and survey id")
					.with_string("survey id")
					.with_string("user id")
					
					.do_it_as()
					.where(MODEL.studentHealthSurvey().classDailyHealthSurvey().eq("${survey id}"),
							MODEL.studentHealthSurvey().student().user().eq("${user id}"),
							MODEL.studentHealthSurvey().surveyStatus().eq(MODEL.surveyStatus().SUBMITTE))
					.wants(MODEL.studentHealthSurvey().studentDailyAnswerList(),MODEL.studentHealthSurvey().studentDailyAnswerList().question())
					
				.query(MODEL.studentHealthSurvey().getModelTypeName())
					.which("student by survey id")
					.with_string("survey id")
					.do_it_as()
					.where(MODEL.studentHealthSurvey().classDailyHealthSurvey().eq("${survey id}"),
							MODEL.studentHealthSurvey().surveyStatus().eq(MODEL.surveyStatus().SUBMITTE))

				.find(MODEL.student().getModelTypeName()).which("name is").with_string("student name").with_string("user id")
					.do_it_as()
					.where(MODEL.student().studentName().eq("${student name}"),MODEL.student().user().eq("${user id}"))
					
				.query(MODEL.studentHealthSurvey().getModelTypeName()).which("is submitted by teacher id").with_string("teacher id")
					.do_it_as()
					.where(MODEL.studentHealthSurvey().teacher().eq("${teacher id}"),MODEL.studentHealthSurvey().surveyStatus().eq(MODEL.surveyStatus().SUBMITTE))
					
				.query(MODEL.studentHealthSurvey().getModelTypeName()).list_of("user").with_string("user id")
					.do_it_as()
					.where(MODEL.studentHealthSurvey().student().user().eq("${user id}"))
					.order_by(MODEL.studentHealthSurvey().answerTime()).desc()
					.wants(MODEL.studentHealthSurvey().studentDailyAnswerList(),MODEL.studentHealthSurvey().studentDailyAnswerList().question(),MODEL.studentHealthSurvey().studentDailyAnswerList().question().questionType(),MODEL.studentHealthSurvey().student())
					
				.find(MODEL.classDailyHealthSurvey().getModelTypeName()).list_of("id").with_string("survey id")
					.do_it_as()
					.where(MODEL.classDailyHealthSurvey().id().eq("${survey id}"))
					.wants(MODEL.classDailyHealthSurvey().studentHealthSurveyList().studentDailyAnswerList().question().questionType(),MODEL.classDailyHealthSurvey().dailySurveyQuestionList(),MODEL.classDailyHealthSurvey().studentHealthSurveyList().student(),MODEL.classDailyHealthSurvey().teacher())
		
				.find(MODEL.classDailyHealthSurvey().getModelTypeName()).list_of("last time").with_string("teacher id").with_date("current survey time")
					.do_it_as()
					.where(MODEL.classDailyHealthSurvey().teacher().eq("${teacher id}"),MODEL.classDailyHealthSurvey().surveyTime().less("${current survey time}"))
					.order_by(MODEL.classDailyHealthSurvey().surveyTime()).desc()
					.wants(MODEL.classDailyHealthSurvey().studentHealthSurveyList().student())
					
				;

	}
}

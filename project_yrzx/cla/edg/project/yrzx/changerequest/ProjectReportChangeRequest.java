package cla.edg.project.yrzx.changerequest;

import java.util.Map;



import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;


/**
 * 
 * 项目报告表单的ChangeRequest
 * 
 * 包括
 * 监理日志
 * 经理日志
 * 施工日志
 * 
 * @author Jarry Zhou
 *
 */
public class ProjectReportChangeRequest implements ChangeRequestSpecFactory {


	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder 
				
			// ✅✅✅ 施工日志
				.change_request("task daily report").zh_CN("施工日志")
				.icon("calendar")
				.step("basic info").zh_CN("基本信息")
					.contains_event("task report basic info").zh_CN("施工基础信息")
						.has_field("task id").zh_CN("工程").hidden().defaule_value("T000001")
						.has_field("task_name").zh_CN("工程名称")
							.disabled()
							.defaule_value("XXX施工")
							.range(1,100)
							.sample_data("墙面施工|水电改造|隔离层鼓包二次整改")
						.has_field("subcontractor_name").zh_CN("分包单位")
							.disabled()
							.defaule_value("XXX建筑公司")
							.range(1,100)
							.sample_data("四川闫明建筑公司|活力装修设计工作室")
						.has_field("responsible_name").zh_CN("施工负责人")
							.disabled()
							.defaule_value("工人XXX")
							.range(1,100)
							.sample_data("张黎明|李大力")
						.has_field("temperature").zh_CN("气温")
							.which_type_of(FieldType.DECIMAL)
							.range(-273.00, 5000)
							.place_holder("请填写施工现场温度")
							.sample_data("17.66|25.01")
						.has_field("weather conditions").zh_CN("天气情况")
							.place_holder("请选择天气情况")
							.values_canbe("晴", "晴").or("阴", "阴").or("雨", "雨")
				.step("step 2").zh_CN("施工质量、安全、进度、机械、劳动力状况及需求")
					.contains_event("common report").zh_CN("日报内容").as("content")
						.has_field("content").zh_CN("描述").which_type_of(FieldType.MULTI_TEXT)
							.optional()
							.place_holder("请输入报告的内容")
						.has_field("images").zh_CN("现场照片").which_type_of(FieldType.IMAGES)
							.optional()
							.place_holder("请上传照片")
//						.has_field("attachment").zh_CN("相关资料").which_type_of(FieldType.)
				.step("step 3").zh_CN("进场材料、使用、检验、封样")
					.contains_event("common report").zh_CN("进场材料、使用、检验、封样")
				.step("step 4").zh_CN("存在安全、质量问题处理意见")
					.contains_event("common report").zh_CN("存在安全、质量问题处理意见")
				.step("step 5").zh_CN("文明施工情况及处理办法见")
					.contains_event("common report").zh_CN("文明施工情况及处理办法")
				.step("step 6").zh_CN("施工配合情况")
					.contains_event("common report").zh_CN("施工配合情况")
				
					
			// ✅✅✅ 项目经理日志
			.change_request("project supervision daily report").zh_CN("项目经理日志")
				.icon("tachometer")
				.step("basic info").zh_CN("基本信息")
					.contains_event("project manager report basic info").zh_CN("施工基础信息")
						.has_field("project id").zh_CN("项目").hidden().defaule_value("P000001")
						.has_field("project_name").zh_CN("工程名称")
							.disabled()
							.defaule_value("XXX装修")
							.range(1,100)
							.sample_data("火车北站候车室装修工程|三峡大坝装修工程")
						.has_field("temperature").zh_CN("气温")
							.which_type_of(FieldType.DECIMAL)
							.range(-273.00, 5000)
							.place_holder("请填写施工现场温度")
							.sample_data("17.66|25.01")
						.has_field("weather conditions").zh_CN("天气情况")
							.place_holder("请选择天气情况")
							.values_canbe("晴", "晴").or("阴", "阴").or("雨", "雨")
				.step("step 2").zh_CN("当日情况总结")
					.contains_event("common report").zh_CN("当日情况总结").as("content")
				.step("step 3").zh_CN("当日情况检查单")
					.contains_event("report check item").zh_CN("检查项").as("project hidden trouble").zh_CN("项目隐患")
						.has_field("check result").zh_CN("检查结果")
							.values_canbe("有", "有").or("无", "无")
							.place_holder("请选择")
						.has_field("process result").zh_CN("处理结果")
							.values_canbe("resolved", "已解决").or("not_resolved", "未解决")
							.place_holder("是否已处理")
							.defaule_value("not_resolved")
					.contains_event("report check item").as("work quanlity").zh_CN("施工质量")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("patrol").zh_CN("旁站/见证/巡视")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("acceptance").zh_CN("验收签证")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("safty").zh_CN("安全文明施工")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("progress").zh_CN("施工进度")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("materials").zh_CN("材料管理")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("subcontract execution").zh_CN("分包合同执行")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("field meeting").zh_CN("现场会议与发文")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("over time").zh_CN("有无加班")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("organization").zh_CN("人员组织状态")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("summary").zh_CN("当日整体评价及结果")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
						
			// ✅✅✅ 项目监理日志
			.change_request("project manager daily report").zh_CN("项目监理日志")
				.icon("tachometer")
				.step("basic info").zh_CN("基本信息")
					.contains_event("project supervisor report basic info").zh_CN("施工基础信息")
						.has_field("project id").zh_CN("项目").hidden().defaule_value("P000001")
						.has_field("project_name").zh_CN("工程名称")
							.disabled()
							.defaule_value("XXX装修")
							.range(1,100)
							.sample_data("火车北站候车室装修工程|三峡大坝装修工程")
						.has_field("temperature").zh_CN("气温")
							.which_type_of(FieldType.DECIMAL)
							.range(-273.00, 5000)
							.place_holder("请填写施工现场温度")
							.sample_data("17.66|25.01")
						.has_field("weather conditions").zh_CN("天气情况")
							.place_holder("请选择天气情况")
							.values_canbe("晴", "晴").or("阴", "阴").or("雨", "雨")
				.step("step 2").zh_CN("施工现场状况")
					.contains_event("common report").zh_CN("当日情况总结").as("content")
				.step("step 3").zh_CN("当日情况检查单")
					.contains_event("report check item").zh_CN("检查项").as("project hidden trouble").zh_CN("项目隐患")
						.has_field("check result").zh_CN("检查结果")
							.values_canbe("有", "有").or("无", "无")
							.place_holder("请选择")
						.has_field("process result").zh_CN("处理结果")
							.values_canbe("resolved", "已解决").or("not_resolved", "未解决")
							.place_holder("是否已处理")
							.defaule_value("not_resolved")
					.contains_event("report check item").as("work quanlity").zh_CN("施工质量")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("patrol").zh_CN("旁站/见证/巡视")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("acceptance").zh_CN("验收签证")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("safty").zh_CN("安全文明施工")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("progress").zh_CN("施工进度")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("materials").zh_CN("材料管理")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("subcontract execution").zh_CN("分包合同执行")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("field meeting").zh_CN("现场会议与发文")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("over time").zh_CN("有无加班")
						.for_field("check result").values_canbe("有", "有").or("无", "无")
					.contains_event("report check item").as("organization").zh_CN("人员组织状态")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.contains_event("report check item").as("summary").zh_CN("当日整体评价及结果")
						.for_field("check result").values_canbe("正常", "正常").or("不正常", "不正常")
					.has_field("patrol_images").zh_CN("监理旁站、见证、巡检图片").which_type_of(FieldType.IMAGES)
					;
		
	}
}

package cla.edg.project.yrzx.changerequest;

import java.util.Map;


import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;


/**
 * 
 * 售后与劳务纠纷表单的hangeRequest
 * 
 * 目前都用一个form
 * 
 * @author Jarry Zhou
 *
 */
public class AfterSalesAndDisputeChangeRequest implements ChangeRequestSpecFactory {
	
	@Override
	public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
		return builder

			.change_request("after sales").zh_CN("售后单")
				.icon("form")
				.has_field("project id").hidden()
				//project name只做显示
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("daily task type id").hidden()
				.has_field("daily task type").zh_CN("售后类型").disabled()
				.has_field("under warranty").zh_CN("保修期中").which_type_of(FieldType.BOOLEAN).values_canbe(true,"是").or(false,"否").with_style(UIStyle.INPUT_SINGLE_SELECT)
				.has_field("warranty statement").value("非保修期中请自行协商费用").display()
				.has_field("title").zh_CN("标题").range(1,50)
				.has_field("question description").zh_CN("问题描述").range(0,300)
				.has_field("images").zh_CN("图片").which_type_of(FieldType.IMAGES)
				.has_field("creator").zh_CN("创建人").disabled()
				.has_field("time").zh_CN("发起时间").which_type_of(FieldType.DATE_TIME).disabled()

			.change_request("resolve after sales").zh_CN("处理售后单")
				.icon("form")
				.has_field("after sales id").hidden()
				.has_field("after sales title").zh_CN("标题").disabled()
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("after sales description").zh_CN("问题描述").disabled()
				.has_field("comments").zh_CN("备注").range(0,300)
				.has_field("images").zh_CN("旁站、巡视、见证图片").which_type_of(FieldType.IMAGES)
				.has_field("creator").zh_CN("提交人").disabled()

			.change_request("project penalties").zh_CN("违约处罚")
				.icon("form")
				.has_field("penalties id").zh_CN("处罚编号").disabled()
				.has_field("project id").zh_CN("项目ID").hidden()
				.has_field("project name").zh_CN("项目名称").disabled()
				.has_field("work package contract").zh_CN("分包合同")
					.which_model_of(MODEL.standardContract())
					.values_can_select_from_query_by(null)
				.has_field("daily task type id").zh_CN("处罚类型id").hidden()
				.has_field("penalties type").zh_CN("处罚类型").disabled()
				.has_field("penalties executor").zh_CN("处罚执行人")
					.which_model_of(MODEL.employeeNomination())
					.values_can_select_from_query_by(null)
				.has_field("forfeit").which_type_of(FieldType.MONEY).zh_CN("处罚金额")
				.has_field("reason").which_type_of(FieldType.MULTI_TEXT).zh_CN("处罚理由")
				.has_field("images").which_type_of(FieldType.IMAGES).zh_CN("旁证、巡视、见证图片")

				;
	}
}

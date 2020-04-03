package cla.poc.pageflowmodel;

import cla.poc.pageflowmodel.spec.Block;
import cla.poc.pageflowmodel.spec.Page;
import cla.poc.pageflowmodel.spec.PageFlow;

public class Example {

	public static void main(String[] args) {
		PageFlow example = PageFlow.start()
				.add(Page.start("project information", "项目信息")
						.add(Block.start()
								.template("model_detail.html.ftl")
								.title("天府广场翻修项目")
								.field("项目名称", "天府广场翻修项目", "content_text")
								.field("施工单位", "四川元谋建筑公司", "content_text")
						).add(Block.start()
								.template("model_detail.html.ftl")
								.title("工程概况")
								.field("项目地址", "天府广场", "content_text")
								.field("面积", "1974523平方米", "content_text")
								.field("开始时间", "2020年12月31日", "content_text")
								.field("竣工时间", "计划于2100年完成", "content_text")
								.field("项目介绍", "火神山总建筑面积3.39万平方米，建成后共设床位1000张。从1月24日上百台挖掘机抵达现场平整土地，到2月2日火神山医院工程完工，总共只用了短短10天时间。据报道，高峰期有4000多名建设者在现场，大型机械设备、车辆近千台，24小时不间断施工。中国央视还开通了火神山施工现场24小时直播供网民观看，高峰时观看人数据称达4000万人。", "long_content_text")
						).add(Block.start()
								.template("document")
						)
				)
				;
	}

}

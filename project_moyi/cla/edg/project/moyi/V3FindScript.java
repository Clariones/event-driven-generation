package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.moyi.gen.graphquery.ArtworkAuctionStatus;
import cla.edg.project.moyi.gen.graphquery.MODEL;

public class V3FindScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				// 写法1: 整个SQL手写,参数手写
				// 参数可以用名字引用, 写法为 ?{参数名}, 会自动在Params里正确位置追加. 
				// param(xxx) 中的xxx 会原样写入代码. 例如要写常量, 就写 param("MyConstant.X"), 生成代码就是 params.add(MyConstant.X), 也可以写变量
				// 例如 param("\"%\" + artworkId + \"%\""), 就会生成 params.add("%"+artworkId+"%"). 就是简单的填入.
				// param_string("xxx")是个简写, 会把写入的内容,最后包含在一个字符串中, 例如 param_string("甲说:\"你好\"") 就会生成params.add("甲说:\"你好\"");
				// 如果用 param("\"甲说:\\\"你好\\\"\"") 就太麻烦
				.find(MODEL.artworkOwnershipCertificate()).which("available for artwork").with_string("artwork id")
					.do_it_as()
						.sql_is("select AC.* from artwork_ownership_certificate_data AC left join certificate_status_data CS on AC.certificate_status=CS.id\n" + 
								"	where AC.artwork=?{artwork id} and CS.code = ?\n" + 
								"    order by AC.id desc \n" + 
								"    limit ? ")
						.param("CertificateStatus.CERTIFICATED").param(1)
						.need_know("com.terapico.moyi.certificatestatus.CertificateStatus")
				// 写法2(单个搜索,不带分页): 只描述搜索条件, 脚本自己分析sql,组装条件. 
				.find(MODEL.artworkAuction()).which("not finished").with_string("artwork id")
					.do_it_as()
						.where(MODEL.artworkAuction().artwork().eq("${artwork id}"),
							MODEL.artworkAuction().artworkAuctionStatus().code().not_in(ArtworkAuctionStatus.CLOSED, ArtworkAuctionStatus.CANCELLED, ArtworkAuctionStatus.BOUGHT_IN)
							)
				.find(MODEL.artworkAuction()).which("not submitted").with_string("artwork id")
					.do_it_as()
						.where(MODEL.artworkAuction().artwork().eq("${artwork id}"),
							MODEL.artworkAuction().artworkAuctionStatus().code().eq(ArtworkAuctionStatus.WAIT_FOR_DISPLAY)
							)
				/*
				.find(MODEL.moyiUser()).which("is owner of artwork by main order").with_string("order id")
					.do_it_as()
						.where(
							MODEL.moyiUser().artworkOwnershipCertificateList().artworkAuctionList().artworkAuctionOrderList().mainOrder().eq("${order id}"),
							MODEL.moyiUser().articleList().not_null()
							)
				*/
				;
	}

	
			
}

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
				.find(MODEL.artworkOwnershipCertificate()).which("available for artwork").with_string("artwork id")
					.do_it_as()
						.sql_is("select AC.* from artwork_ownership_certificate_data AC left join certificate_status_data CS on AC.certificate_status=CS.id\n" + 
								"	where AC.artwork=?{artwork id} and CS.code = ?\n" + 
								"    order by AC.id desc \n" + 
								"    limit ?")
						.param("CertificateStatus.CERTIFICATED").param(1)
						.need_know("com.terapico.moyi.certificatestatus.CertificateStatus")
				// 写法2(单个搜索,不带分页): 只描述搜索条件, 脚本自己分析sql,组装条件
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
				;
	}

	
			
}

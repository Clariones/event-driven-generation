package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.moyi.gen.graphquery.ArtworkAuctionStatus;
import cla.edg.project.moyi.gen.graphquery.MODEL;

public class V3FindScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.find(MODEL.artworkOwnershipCertificate()).which("available for artwork").with_string("artwork id")
					.do_it_as()
						.sql_is("select AC.* from artwork_ownership_certificate_data AC left join certificate_status_data CS on AC.certificate_status=CS.id\n" + 
								"	where AC.artwork=?{artwork id} and CS.code in (?,?)\n" + 
								"    order by AC.id desc \n" + 
								"    limit ?")
						.param("CertificateStatus.CERTIFICATED").param_string("Certificated").param(1)
						.need_know("com.terapico.moyi.certificatestatus.CertificateStatus")
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

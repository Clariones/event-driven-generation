package cla.edg.project.moyi;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class V3FindScript extends PieceOfScript {
	@Override
	public PageFlowScript makeSequel(PageFlowScript script) {
		return script
				.find("artwork_ownership_certificate").which("available for artwork").with_string("artwork id")
					.do_it_as()
						.sql_is("select AC.* from artwork_ownership_certificate_data AC left join certificate_status_data CS on AC.certificate_status=CS.id\n" + 
								"	where AC.artwork=?{artwork id} and CS.code in (?,?)\n" + 
								"    order by AC.id desc \n" + 
								"    limit ?")
						.param("CertificateStatus.CERTIFICATED").param_string("Certificated").param(1)
						.need_know("com.terapico.moyi.certificatestatus.CertificateStatus")
				
				;
	}

	
			
}

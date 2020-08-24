package test.terapico.query;

import builder.Utils;
import cla.edg.project.saleschain.gen.dbquery.MODEL;
import clariones.poc.pathmap.PathMap;
import com.terapico.query.builder.QueryBuilderV2;
import com.terapico.query.utils.PathMapUtil;
import com.terapico.query.utils.SelectClauseUtil;
import com.terapico.query.utils.WhereClauseUtil;

public class Case2 {
    public void run() {
        QueryBuilderV2 builder  = new QueryBuilderV2();

        QueryBuilderV2 rst = builder
                .where(
                        MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile number}").optional()
                            .or(MODEL.demand().submitter().mobile().eq("${mobile}").optional()
                                    .and(MODEL.demand().demandType().code().is_null())
                            ),
                        MODEL.demand().submitter().mobile().eq(MODEL.demand().demandProposalList().supplier().adminMobile())
                            .or(MODEL.merchant().name().eq("ABC").and(MODEL.merchant().name().eq("CDF")),
                                    MODEL.mobileApp().pageList().is_null())
                        ,
                        MODEL.demand().demandStatus().code().eq(MODEL.article().articleType().code()))

//                .where(MODEL.demand().demandProposalList().supplier().adminMobile().eq(MODEL.mobileUser().mobile()),
//                        MODEL.mobileUser().mobile().eq("${mobile}"))

                ;

        PathMap pathMap = PathMapUtil.makePathMap(rst.getWhereClause(), false);
        String fromStr = SelectClauseUtil.makeFromClause(pathMap);
        Utils.debug(fromStr);
        WhereClauseUtil.makeWhere(rst.getWhereClause());
        System.out.println(Utils.toJson(rst, true));
    }
}

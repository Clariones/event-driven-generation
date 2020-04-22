package cla.edg.project.yrzx.changerequest;

import cla.edg.project.yrzx.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class ProjectMaterialChangeRequest implements ChangeRequestSpecFactory {
    @Override
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add contract comments").zh_CN("批注").icon("edit")
                .contains_event("contract comments").zh_CN("批注")
                    .has_field("contract id").zh_CN("ID").disabled()
                    .has_field("approve result").zh_CN("审核结果").hidden()
                    .has_field("contract name").zh_CN("合同").disabled()
                    .has_field("comments").zh_CN("批注").which_type_of(FieldType.MULTI_TEXT)

                .change_request("add project material comments").zh_CN("批注").icon("edit")
                .contains_event("project material comments").zh_CN("批注")
                    .has_field("project material").zh_CN("ID").disabled()
                    .has_field("approve result").zh_CN("审核结果").hidden()
                    .has_field("title").zh_CN("资料名称").disabled()
                    .has_field("review result").zh_CN("结论").which_model_of(MODEL.projectMaterialReviewStatus().getModelTypeName()).values_can_select_from_query_by(null)
                    .has_field("comments").zh_CN("批注").which_type_of(FieldType.MULTI_TEXT)

                ;
    }
}

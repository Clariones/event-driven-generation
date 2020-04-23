package cla.edg.project.yrzx.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class ProjectMaterialChangeRequest implements ChangeRequestSpecFactory {
    @Override
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("review contract").zh_CN("审核合同").icon("edit")
                .contains_event("contract review").zh_CN("审核意见")
                .has_field("contract id").zh_CN("ID").hidden()
                .has_field("scene code").zh_CN("场景").hidden()
                .has_field("contract name").zh_CN("合同名称").display().value("合同名称")
                .has_field("contract code").zh_CN("合同编号").display().value("合同编号")
                .has_field("passed").zh_CN("审核结果").values_canbe(true, "同意").or(false, "不同意")
                .has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)

            .change_request("comments on contract").zh_CN("合同批注").icon("edit")
                .contains_event("contract comment").zh_CN("合同批注")
                .has_field("contract id").zh_CN("ID").hidden()
                .has_field("scene code").zh_CN("场景").hidden()
                .has_field("contract name").zh_CN("合同名称").display().value("合同名称")
                .has_field("contract code").zh_CN("合同编号").display().value("合同编号")
                .has_field("comments").zh_CN("批注").which_type_of(FieldType.MULTI_TEXT)
                .has_field("images").zh_CN("附图").which_type_of(FieldType.IMAGES)


            .change_request("review materials").zh_CN("资料审核").icon("edit")
                .contains_event("material review").zh_CN("审核意见")
                .has_field("material id").zh_CN("ID").hidden()
                .has_field("scene code").zh_CN("场景").hidden()
                .has_field("material name").zh_CN("资料名称").display().value("资料名称")
                .has_field("passed").zh_CN("审核结果").values_canbe(true, "同意").or(false, "不同意")
                .has_field("comments").zh_CN("备注").which_type_of(FieldType.MULTI_TEXT)

            .change_request("comments on materials").zh_CN("资料批注").icon("edit")
                .contains_event("material comment").zh_CN("资料批注")
                .has_field("material id").zh_CN("ID").hidden()
                .has_field("scene code").zh_CN("场景").hidden()
                .has_field("material name").zh_CN("资料名称").display().value("资料名称")
                .has_field("comments").zh_CN("批注").which_type_of(FieldType.MULTI_TEXT)
                .has_field("images").zh_CN("附图").which_type_of(FieldType.IMAGES)
                ;
    }
}

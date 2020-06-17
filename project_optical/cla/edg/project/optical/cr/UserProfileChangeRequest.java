package cla.edg.project.optical.cr;

import cla.edg.project.optical.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class UserProfileChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("test cr").zh_CN("测试form")
            .step("base info").zh_CN("基本信息")
                .contains_event("invitor").zh_CN("被邀请人").many_times(1,10).show_them_all_in_cr()
                    .as("guest")
                    .has_field("name").zh_CN("姓名")
                    .has_field("mobile").zh_CN("电话")
                    .has_field("type").zh_CN("类型").which_model_of(MODEL.coatingType())
                        .values_can_select_from_query_by(null)
                        .defaule_value("OLEOPHOBIC_AR_COATING")
                        // .fill_by_request("catalog id")

                .contains_event("master").zh_CN("被邀请人")
                    .as("owner")
                    .has_field("name").zh_CN("姓名")
                        .fill_by_request_member("catalog id", MODEL.catalog().name())
            .step("step 2").zh_CN("宴会内容")
                .contains_event("dinner").zh_CN("宴会")
                    .has_field("invitor name").zh_CN("邀请人姓名").disabled()
                        .fill_by_submitted("guest.name")

                ;
    }
}

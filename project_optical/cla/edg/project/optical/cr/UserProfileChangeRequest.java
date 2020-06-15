package cla.edg.project.optical.cr;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.Map;

public class UserProfileChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        builder.change_request("test cr").zh_CN("测试form")
                .contains_event("invitor").zh_CN("被邀请人").many_times(1,10).show_them_all_in_cr()
                    .has_field("name").zh_CN("姓名")
                    .has_field("mobile").zh_CN("电话")

                ;

        return builder;
    }
}

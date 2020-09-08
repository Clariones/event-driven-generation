package cla.edg.project.sds.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class UserProfileChangeRequest implements ChangeRequestSpecFactory {

    @Override
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("update profile").zh_CN("更新个人信息")
                .has_field("name").zh_CN("用户名")
                .has_field("avantar").zh_CN("头像").which_type_of(FieldType.IMAGE)
        ;
    }
}

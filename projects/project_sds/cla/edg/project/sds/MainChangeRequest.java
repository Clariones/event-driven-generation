package cla.edg.project.sds;

import cla.edg.project.sds.changerequest.UserProfileChangeRequest;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.Map;

public class MainChangeRequest implements ChangeRequestSpecFactory {

    @Override
    public Map<String, Map<String, Object>> getSpec() {
        return getScript();
    }

    private Map<String, Map<String, Object>> getScript() {
        return ChangeRequestSpecBuilder.for_project("frontendpoc")
                .request_base("clientService/handleCR/")

                .import_from(new UserProfileChangeRequest())
                .getChangeRequestSpec();
    }
}

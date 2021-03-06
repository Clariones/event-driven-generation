package cla.edg.project.optical;

import cla.edg.project.optical.cr.AllFieldTypeChangeRequest;
import cla.edg.project.optical.cr.UserProfileChangeRequest;
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
                .import_from(new AllFieldTypeChangeRequest())
                .getChangeRequestSpec();
    }
}

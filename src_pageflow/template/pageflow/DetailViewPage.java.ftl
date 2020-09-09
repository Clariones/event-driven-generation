<#import "tools.ftl" as T/>
package ${package};

import ${base_package}.BaseEntity;
import ${base_package}.${custom_context_name};
import ${base_package}.${project_name?cap_first}BaseUtils;
import com.terapico.caf.Images;
import com.terapico.caf.viewcomponent.VComponentAction;
import com.terapico.caf.viewcomponent.VComponentSection;
import com.terapico.utils.MapUtil;

import java.math.BigDecimal;
import java.util.*;

public abstract class BaseDetailViewPage extends CustomBaseViewPage{
    protected static final String STATUS_DISPLAY_MODE = "{\"imageUrl\":\"\",\"name\":\"auto\",\"title\":\"name\",\"imageList\":\"\"}";
    protected List<Object> propList;
    protected List<VComponentAction> actionList;
    protected List<VComponentSection> sectionList;
    protected int fieldsNum = 0;

    @Override
    protected void afterDoRendering() {
        super.afterDoRendering();
        forceResponseAsDetailPage();
    }

    protected String propId() {
        return "pp_" + (++fieldsNum);
    }

    private Map<String, Object> addProperty(String id, String label, Object content, String type, String displayMode) {
        if (propList == null) {
            propList = new ArrayList<>();
            put("propList", propList);
        }
        String propKey = id;
        if (displayMode == null) {
            displayMode = "{}";
        }
        Map<String, Object> prop = MapUtil.put("id", propKey)
                .put("fieldName", propKey)
                .put("label", label)
                .put("type", type)
                .put("linkToUrl", "")
                .put("displayMode", displayMode)
                .into_map();
        propList.add(prop);
        put(propKey, content);
        return prop;
    }

    protected void addStatusProperty(String label, BaseEntity content) {
        addProperty(propId(), label, content, "status", STATUS_DISPLAY_MODE);
    }

    protected void addTextProperty(String label, String content) {
        addProperty(propId(), label, content, "text", null);
    }

    protected void addCenterTextProperty(String content) {
        addProperty(propId(), null, content, "section", null);
    }

    protected void addRichTextProperty(String label, String content) {
        addProperty(propId(), label, content, "richtext", null);
    }

    protected void addDateTimeProperty(String label, Date content) {
        addProperty(propId(), label, content, "datetime", null);
    }

    protected void addImagesProperty(String label, Images content) {
        addProperty(propId(), label, content, "image-list", null);
    }

    protected void addImageProperty(String label, String imageUrl) {
        addProperty(propId(), label, imageUrl, "image", null);
    }

    protected void addTextMoneyProperty(String label, BigDecimal content) {
        addProperty(propId(), label, ${project_name?cap_first}BaseUtils.formatCash(content), "money", null);
    }

    protected void addDocumentProperty(String label, String content) {
        addProperty(propId(), label, content, "document", null);
    }

    protected void addLongTextProperty(String label, String content) {
        addProperty(propId(), label, content, "longtext", null);
    }


    protected void addSection(String sectionKey, String displayMode, String title, String linkToUrl) {
        VComponentSection section = new VComponentSection()
                .id(sectionKey)
                .title(title)
                .displayMode(displayMode)
                .linkToUrl(linkToUrl);
        if (sectionList == null) {
            sectionList = new ArrayList<>();
            put("sectionList", sectionList);
        }
        sectionList.add(section);
    }


    protected void addActionList(List<VComponentAction> actions, String toGroup) {
        actions.forEach(action -> addAction(action, toGroup));
    }

    protected void addAction(VComponentAction action, String toGroup) {
        if (toGroup != null) {
            action.setGroup(toGroup);
        }
        if (actionList == null) {
            actionList = new ArrayList<>();
            put("actionList", actionList);
        }
        actionList.add(action);
    }
}

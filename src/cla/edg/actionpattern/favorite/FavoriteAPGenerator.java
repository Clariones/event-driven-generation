package cla.edg.actionpattern.favorite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cla.edg.Utils;
import cla.edg.actionpattern.BaseAPGenerator;
import cla.edg.actionpattern.GenrationResult;

public class FavoriteAPGenerator extends BaseAPGenerator {
	protected FavoriteAPInfo input;
	
	public FavoriteAPInfo getInput() {
		return input;
	}

	public void setInput(FavoriteAPInfo input) {
		this.input = input;
	}

	@Override
	public List<GenrationResult> runJob() throws Exception {
		String base_packge = input.getBasePackageName();
		String user_context_class = Utils.toCamelCase(input.getUserContextClassName());
		String record_model = input.getRecordModelName();
		String target_model = input.getTargetModelName();
		String actor_model = input.getActorModelName();
		String record_class = Utils.toCamelCase(input.getRecordModelName());
		String target_class = Utils.toCamelCase(input.getTargetModelName());
		String actor_class = Utils.toCamelCase(input.getActorModelName());
		
		Map<String, Object> data = new HashMap<>();
		data.put("base_package", base_packge);
		data.put("user_context_class", user_context_class);
		data.put("record_model", record_model);
		data.put("target_model", target_model);
		data.put("actor_model", actor_model);
		data.put("record_class", record_class);
		data.put("target_class", target_class);
		data.put("actor_class", actor_class);
		
		GenrationResult baseUtilClass = doGeneration(data, "actionpattern/favorite/BaseUtil.java.ftl",
				toFileName(data, "${base_package?replace('.','/')}/aputils/BaseFavorite${target_class}Of${actor_class}Util.java"));
		baseUtilClass.setActionCode(GenrationResult.ACTION_REPLACE);
		GenrationResult utilClass = doGeneration(data, "actionpattern/favorite/Util.java.ftl",
				toFileName(data, "${base_package?replace('.','/')}/aputils/Favorite${target_class}Of${actor_class}Util.java"));
		utilClass.setActionCode(GenrationResult.ACTION_CREATE_WHEN_NEED);
		
		GenrationResult baseResultClass = doGeneration(data, "actionpattern/favorite/BaseResult.java.ftl",
				toFileName(data, "${base_package?replace('.','/')}/aputils/BasicC2CResult.java"));
		baseResultClass.setActionCode(GenrationResult.ACTION_REPLACE);
		GenrationResult resultClass = doGeneration(data, "actionpattern/favorite/Result.java.ftl",
				toFileName(data, "${base_package?replace('.','/')}/aputils/${target_class}Of${actor_class}C2CResult.java"));
		resultClass.setActionCode(GenrationResult.ACTION_CREATE_WHEN_NEED);
		
		GenrationResult modelPatch = doGeneration(data, "actionpattern/favorite/model.xml.ftl",
				toFileName(data, "${base_package?replace('.','/')}/aputils/${target_class}Of${actor_class}Model.xml"));
		modelPatch.setActionCode(GenrationResult.ACTION_MERGE);
		
		return Utils.toList(baseUtilClass, utilClass, baseResultClass,resultClass, modelPatch);
	}
	
}

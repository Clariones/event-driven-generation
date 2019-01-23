package cla.edg.generator;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cla.edg.Utils;
import cla.edg.eventscript.EventInfo;
import cla.edg.eventscript.EventProcessResultBranch;
import cla.edg.eventscript.EventRipple;
import cla.edg.eventscript.EventScript;
import freemarker.template.Template;

public class EventScriptGenerator extends BasicGenerator{
	public void generateWithScript(EventScript script) throws Exception {
		verifyScriptWasFinished(script);
		
		String packageName = this.getBasePackageName()+"."+Utils.toCamelCase(script.getBussinessName()).toLowerCase();
		String outputFileName = Utils.toCamelCase(script.getBussinessName())+"Service.java";
		File outputFile = new File(getBaseOutputFolderFile(), Utils.packageNameToPath(packageName)+"/Base"+outputFileName);
		String className = "Base"+Utils.toCamelCase(script.getBussinessName())+"Service";
		System.out.println("Write to " + outputFile.getCanonicalPath());
		
		Map<String, Object> data = prepareData(script, packageName, className);
		data.put("helper", new EventScriptGeneratorHelper());
		
		String tmplFileName = "event/Service.java.ftl";
		Template template = getTemplate(tmplFileName);
		
		doGeneration(outputFile, data, template);
	}

	private void verifyScriptWasFinished(EventScript script) {
		// 事件不能定义多个处理
		// 所有事件涟漪必须被处理
		// 所有 internal event 必须被触发
		Set<String> eventRippleSet = new HashSet<>();
		Set<String> publicEventSet = new HashSet<>();
		Set<String> internalEventSet = new HashSet<>();
		Set<String> duplicateEventSet = new HashSet<>();
		// 先收集所有数据
		for(EventInfo eventInfo : script.getEvents()) {
			boolean added = false;
			if (eventInfo.isExternalEvent()) {
				added = publicEventSet.add(eventInfo.getName());
			}else {
				added = internalEventSet.add(eventInfo.getName());
			}
			if (!added) {
				duplicateEventSet.add(eventInfo.getName());
			}
			if (eventInfo.getBranches() == null) {
				continue;
			}
			for(EventProcessResultBranch bch : eventInfo.getBranches().values()) {
				if (bch.getEventRipples() == null) {
					continue;
				}
				for(EventRipple evtRpl : bch.getEventRipples()) {
					if (evtRpl.getServiceName() != null) {
						continue;
					}
					eventRippleSet.add(evtRpl.getEventCode());
				}
			}
		}
		// 事件不能定义多个处理
		if (duplicateEventSet.size() > 0) {
			throw new RuntimeException("以下事件被重复定义："+duplicateEventSet);
		}
		// 所有事件涟漪必须被处理
		Set<String> allEvtRpls = new HashSet<>(eventRippleSet);
		allEvtRpls.removeAll(publicEventSet);
		allEvtRpls.removeAll(internalEventSet);
		if (allEvtRpls.size() > 0) {
			throw new RuntimeException("以下事件未被处理："+allEvtRpls);
		}
		// 所有 internal event 必须被触发
		allEvtRpls = new HashSet<>(internalEventSet);
		allEvtRpls.removeAll(eventRippleSet);
		if (allEvtRpls.size() > 0) {
			throw new RuntimeException("以下内部事件从未被触发："+allEvtRpls);
		}
	}
	
}

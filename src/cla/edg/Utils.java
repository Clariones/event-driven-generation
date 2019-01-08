package cla.edg;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cla.edg.script.EventScript;

public class Utils {

	public static String toJson(Object object, boolean pretty) {
		if (!pretty) {
			return new Gson().toJson(object);
		}
		return new GsonBuilder().setPrettyPrinting().create().toJson(object);
	}

	public static String toCamelCase(String name) {
		String[] strSegs = name.trim().split("[\\s\\-_]");
		StringBuilder sb = new StringBuilder();
		for(String str : strSegs) {
			sb.append(Character.toUpperCase(str.charAt(0)));
			if (str.length() > 1) {
				sb.append(str.substring(1).toLowerCase());
			}
		}
		return sb.toString();
	}

	public static String packageNameToPath(String packageName) {
		return packageName.replace('.', '/');
	}

	public static String toJavaConstStyle(String name) {
		String[] strSegs = name.trim().split("[\\s\\-_]");
		StringBuilder sb = new StringBuilder();
		for(String str : strSegs) {
			if (sb.length() > 0) {
				sb.append("_");
			}
			sb.append(str.toUpperCase());
		}
		return sb.toString();
	}

}

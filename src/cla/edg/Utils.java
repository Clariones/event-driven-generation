package cla.edg;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {
	public static class MapBuilder {
		private Map<String, Object> mapInstance= null;
		public MapBuilder put(String key, Object value) {
			ensuerMapInstance();
			mapInstance.put(key, value);
			return this;
		}
		public MapBuilder putIf(boolean shouldPut, String key, Object value) {
			if (!shouldPut) {
				return this;
			}
			ensuerMapInstance();
			mapInstance.put(key, value);
			return this;
		}
		private void ensuerMapInstance() {
			if (mapInstance == null) {
				mapInstance = new HashMap<String, Object>();
			}
		}
		public Map<String, Object> into_map() {
			ensuerMapInstance();
			return mapInstance;
		}
		public <T> Map<String, T> into_map(Class<T> clazz) {
			ensuerMapInstance();
			return (Map<String, T>)mapInstance;
		}
		
	}
	public static MapBuilder put(String key, Object value) {
		return new MapBuilder().put(key, value);
	}
	public static MapBuilder putIf(boolean shouldPut, String key, Object value) {
		return new MapBuilder().putIf(shouldPut, key, value);
	}
	
	public static String toJson(Object object, boolean pretty) {
		if (!pretty) {
			return new Gson().toJson(object);
		}
		return new GsonBuilder().setPrettyPrinting().create().toJson(object);
	}

	public static String removeSeperator(String name) {
		return name.replace("_", " ");
	}
	public static String toCamelCase(String name) {
		if (name == null || name.isEmpty()) {
			return name;
		}
		if (name.matches("^[A-Z][a-zA-Z0-9]+$")) {
			return name;
		}
		if (name.matches("^[a-z][a-zA-Z0-9]+$")) {
			return Character.toUpperCase(name.charAt(0)) + name.substring(1);
		}
		if (name.matches("^[\\w_\\- ]+$")) {
			String[] segments = name.split("\\s*[ \\-_]\\s*");
			StringBuilder sb = new StringBuilder();
			for (String seg : segments) {
				if (seg.length() == 1) {
					sb.append(seg.toUpperCase());
				} else {
					sb.append(Character.toUpperCase(seg.charAt(0)) + seg.substring(1));
				}
			}
			return sb.toString();
		}
		throw new RuntimeException("无法处理名称: " + name);
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
	public static String toJavaVariableName(String paramName) {
		String tn = Utils.toCamelCase(paramName);
		return Utils.uncapFirst(tn);
	}
	
	public static String uncapFirst(String tn) {
		if (tn == null || tn.isEmpty()) {
			return tn;
		}
		return Character.toLowerCase(tn.charAt(0)) + tn.substring(1);
	}
	public static String capFirst(String tn) {
		if (tn == null || tn.isEmpty()) {
			return tn;
		}
		return Character.toUpperCase(tn.charAt(0)) + tn.substring(1);
	}
	public static String getClassNameFromFullName(String typeClassName) {
		int pos = typeClassName.lastIndexOf('.');
		if (pos > 0) {
			return typeClassName.substring(pos+1);
		}
		return typeClassName;
	}
	
	public static <T> List<T> toList(T ... objs) {
		return new ArrayList<T>(Arrays.asList(objs));
	}

	public static void saveIntoFile(File file, String content) throws Exception {
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		try(FileWriter fout = new FileWriter(file)) {
			fout.write(content);
			fout.flush();
			System.out.println("write into " + file.getCanonicalPath());
		}
	}
	
	public static List<String> findAllMatched(String source, Pattern pattern) {
		Matcher matcher = pattern.matcher(source);
		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			list.add(matcher.group());
		}
		return list;

	}
	
}

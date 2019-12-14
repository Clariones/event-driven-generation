package cla.edg;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
	public static String repeat(int time) {
		return repeat("?",",",time);
	}
	public static String repeat(String text, String seperator, int times) {
		StringBuilder sb = new StringBuilder();
		while(times-- > 0) {
			sb.append(text);
			if (times > 0) {
				sb.append(seperator);
			}
		}
		return sb.toString();
	}
	public static List<Object> convertToList(Object data) {
		if (data == null) {
			return new ArrayList<>();
		}
		if (data instanceof Collection) {
			return new ArrayList<>((Collection)data);
		}
		if (data.getClass().isArray()) {
			return new ArrayList<>(Arrays.asList((Object[])data));
		}
		return new ArrayList<>(Arrays.asList(data));
	}
	
	protected static final Map<String, List<Object>> additionalRecord = new HashMap<>();
	public static boolean record(String groupName, Object data) {
		List<Object> list = additionalRecord.get(groupName);
		if (list == null) {
			list = new ArrayList<>();
			additionalRecord.put(groupName, list);
		}
		if (list.contains(data)) {
			return false;
		}
		list.add(data);
		return true;
	}
	
	protected static Pattern ptnStrConst = Pattern.compile("\\$\\{\\'(.*)\\'\\}");
	protected static Pattern ptnVarConst = Pattern.compile("\\$\\{(.*)\\}");
	public static String asELVariable(String exp) {
		Matcher m;
		m = ptnStrConst.matcher(exp);
		if (m.matches()) {
			return toJson(m.group(1), false);
		}
		
		m = ptnVarConst.matcher(exp);
		if (m.matches()) {
			return toJavaVariableName(m.group(1));
		}
		
		return exp;
	}
	
	public static boolean isElVariable(String exp) {
		Matcher m;
		m = ptnStrConst.matcher(exp);
		if (m.matches()) {
			return false;
		}
		
		m = ptnVarConst.matcher(exp);
		if (m.matches()) {
			return true;
		}
		
		return false;
	}
	public static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		if (str.trim().isEmpty()) {
			return true;
		}
		return false;
	}
}

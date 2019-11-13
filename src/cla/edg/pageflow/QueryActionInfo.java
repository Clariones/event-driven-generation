package cla.edg.pageflow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import cla.edg.Utils;

public class QueryActionInfo {
	protected String sqlTemplate;
	protected List<Object> paramDefinitions;
	protected Set<String> externTypesNeedKnown;
	
	public Set<String> getExternTypesNeedKnown() {
		if (externTypesNeedKnown == null) {
			externTypesNeedKnown = new HashSet<>();
		}
		return externTypesNeedKnown;
	}

	public void setExternTypesNeedKnown(Set<String> externTypesNeedKnown) {
		this.externTypesNeedKnown = externTypesNeedKnown;
	}

	public List<Object> getParamDefinitions() {
		if (paramDefinitions == null) {
			paramDefinitions = new ArrayList<>();
		}
		return paramDefinitions;
	}

	public void setParamDefinitions(List<Object> paramDefinitions) {
		this.paramDefinitions = paramDefinitions;
	}

	public String getSqlTemplate() {
		return sqlTemplate;
	}

	public void setSqlTemplate(String sql) {
		sqlTemplate = sql;
	}
	
	public void addParam(Object param) {
		getParamDefinitions().add(String.valueOf(param));
	}
	public void addParamString(Object param) {
		getParamDefinitions().add(new Gson().toJson(param));
	}
	
	public String getDbSql() {
		return this.getSqlTemplate().replaceAll("\\?\\{[^\\}]+\\}", "?").replace("\n", "\" +\n\t\t\t\" ");
	}
	
	Pattern ptnSqlParam = Pattern.compile("(\\?(\\{[^\\}]+\\})?)");
	public List<Object> getParamPrepareQueue() {
		List<Object> result = new ArrayList<>();
		List<String> segs = Utils.findAllMatched( this.getSqlTemplate(), ptnSqlParam);
		int curAdditionalParamIdx = 0;
		for(String seg : segs) {
			System.out.println(seg);
			if (seg.equals("?")) {
				result.add(getParamDefinitions().get(curAdditionalParamIdx++));
				continue;
			}
			String name = seg.substring(2, seg.length()-1);
			result.add(Utils.toJavaVariableName(name));
		}
		return result;
	}
}

package cla.poc.pageflowmodel.spec;

import java.util.ArrayList;
import java.util.List;

public class Block {
	public String templateName;
	public String title;
	public List<SampleData> sampleDataList;
	
	public static Block start() {
		return new Block();
	}

	public Block template(String tname) {
		templateName = tname;
		return this;
	}

	public Block title(String tName) {
		this.title = tName;
		return this;
	}

	public Block field(String name, String value, String cssClassName) {
		SampleData  data = new SampleData();
		data.name = name;
		data.value = value;
		data.cssClassName = cssClassName;
		ensureSampleDataList().add(data);
		return this;
	}

	private List<SampleData> ensureSampleDataList() {
		if (sampleDataList==null) {
			return sampleDataList = new ArrayList<>();
		}
		return sampleDataList;
	}

}

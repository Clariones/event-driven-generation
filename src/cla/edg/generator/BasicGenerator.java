package cla.edg.generator;

public class BasicGenerator {

	protected String baseOutputFolder;
	protected String baseTempalteFolder;

	public String getBaseOutputFolder() {
		return baseOutputFolder;
	}

	public void setBaseOutputFolder(String baseOutputFolder) {
		this.baseOutputFolder = baseOutputFolder;
	}

	public String getBaseTempalteFolder() {
		return baseTempalteFolder;
	}

	public void setBaseTempalteFolder(String baseTempalteFolder) {
		this.baseTempalteFolder = baseTempalteFolder;
	}

	protected String basePackageName;
	protected String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBasePackageName() {
		return basePackageName;
	}

	public void setBasePackageName(String basePackageName) {
		this.basePackageName = basePackageName;
	}

}

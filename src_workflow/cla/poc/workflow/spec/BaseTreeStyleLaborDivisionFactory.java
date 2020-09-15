package cla.poc.workflow.spec;

public class BaseTreeStyleLaborDivisionFactory {
    protected String currentWorkingPath = "/";
    protected Object currentWorking = null;

    protected void workingOn(String path, Object working){
        currentWorkingPath = path;
        currentWorking = working;
    }

    protected boolean isWorkingOn(String path) {
        return currentWorkingPath.equalsIgnoreCase(path);
    }

    protected boolean isWorkingAbove(String path) {
        if (isWorkingOn(path)){
            return false;
        }
        return path.toLowerCase().startsWith(asPath(currentWorkingPath).toLowerCase());
    }

    protected boolean isWorkingUnder(String path){
        if (isWorkingOn(path)){
            return false;
        }
        return currentWorkingPath.toLowerCase().startsWith(asPath(path).toLowerCase());
    }

    private String asPath(String path) {
        if (path.endsWith("/")){
            return path;
        }
        return path.replaceAll("/+$", "/");
    }
}

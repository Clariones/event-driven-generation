package cla.edg.pageflow;

public abstract class BasePageFlowDescriptionScript{
    protected static PageFlowScript $(String name) {
        PageFlowScript result = new PageFlowScript();
        result.setName(name);
        return result;
    }

    protected static String getClassName(String fullClassName) {
        int pos = fullClassName.lastIndexOf(".");
        return pos > 0 ? fullClassName.substring(pos+1) : fullClassName;
    }

    protected static String getPackageName(String fullClassName) {
        int pos = fullClassName.lastIndexOf(".");
        return pos > 0 ? fullClassName.substring(0,pos) : fullClassName;
    }

    public abstract PageFlowScript getScript();
}

package sg.edu.rp.c346.tw_listview;

public class CourseStructure {
    private String module;
    private boolean isCom;

    public CourseStructure(String module, boolean isCom) {
        this.module = module;
        this.isCom = isCom;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public boolean isCom() {
        return isCom;
    }

    public void setCom(boolean com) {
        isCom = com;
    }
}

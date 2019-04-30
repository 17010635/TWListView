package sg.edu.rp.c346.tw_listview;

public class CourseStructure {
    private String year;
    private String module;
    private boolean isCom;

    public CourseStructure(String year, String module, boolean isCom) {
        this.year = year;
        this.module = module;
        this.isCom = isCom;
    }

    public String getYear() {
        return year;
    }

    public void setName(String year) {
        this.year = year;
    }

    public boolean isCom() {
        return isCom;
    }

    public void setCom(boolean com) {
        isCom = com;
    }
}

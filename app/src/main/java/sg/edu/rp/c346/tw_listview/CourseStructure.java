package sg.edu.rp.c346.tw_listview;

public class CourseStructure {
    private String year;
    private String module;

    public CourseStructure(String year, String module) {
        this.year = year;
        this.module = module;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}

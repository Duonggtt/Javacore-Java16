package constant;

public enum TeacherLevel {

    GS_TS("GS-TS"),
    PGS_S("PGS-TS"),
    TEACHER("Giang vien"),
    MASTER("Thac si");


    public String value;

    TeacherLevel(String value) {
        this.value = value;
    }
}

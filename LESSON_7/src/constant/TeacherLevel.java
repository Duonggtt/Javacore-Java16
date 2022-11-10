package constant;

public enum TeacherLevel {

    GS_TS(" GS-TS"),
    PGS_TS("PGS-TS"),
    TEACHER("Giảng viên chính"),
    MASTER("Thạc sĩ");


    public String value;

    TeacherLevel(String value) {
        this.value = value;
    }
}

package constant;

public enum ReporterType {

    PROFESSIONAL("Chuyên nghiệp"),
    AMATEUR("Nghiệp dư"),
    COLLABORATOR("Cộng tác viên");

    public String value;

    ReporterType(String value) {
        this.value = value;
    }
}

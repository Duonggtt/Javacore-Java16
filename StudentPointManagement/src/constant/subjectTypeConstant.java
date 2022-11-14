package constant;

public enum subjectTypeConstant {

    GENERAL_SUBJECT("Đại cương"),
    BASIC_SUBJECT("Cơ sở ngành"),
    SPECIALIZED_SUBJECT("Chuyên ngành");

    public String value;

    subjectTypeConstant(String value) {
        this.value = value;
    }
}

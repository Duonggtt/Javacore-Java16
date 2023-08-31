public enum PositionType {
    QL_CC("Quản lý cao cấp"),
    QL_CT("Quản lý cấp trung"),
    QL_CThap("QUản lý cấp thấp"),
    NV("Nhân viên");

    public String value;

    PositionType(String value) {
        this.value = value;
    }
}

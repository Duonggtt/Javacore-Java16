package constant;

public enum DriverLevel {

    TYPE_A("Loại A"),
    TYPE_B("Loại B"),
    TYPE_C("Loại C"),
    TYPE_D("Loại D"),
    TYPE_E("Loại E"),
    TYPE_F("Loại F");

    public String value;

    DriverLevel(String value) {
        this.value = value;
    }
}

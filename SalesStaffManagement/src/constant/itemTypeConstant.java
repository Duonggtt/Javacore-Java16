package constant;

public enum itemTypeConstant {

    ELECTRONIC("Dien tu"),
    REFRIGERATION("Dien lanh"),
    COMPUTER("May tinh"),
    OFFICE_EQUIPMENT("Thiet bi van phong");


    public String value;

    itemTypeConstant(String value) {
        this.value = value;
    }
}

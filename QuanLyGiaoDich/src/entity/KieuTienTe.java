package entity;

public enum KieuTienTe {

    TIEN_VN("Tien Viet Nam"),
    TIEN_USD("Tien USD"),
    TIEN_EURO("Tien Euro");

    public String value;

    KieuTienTe(String value) {
        this.value = value;
    }
}

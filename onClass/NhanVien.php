class Nhanvien {
    private $conn;

    public function __construct($conn) {
        $this->conn = $conn;
    }

    public function getDanhSachNhanVien() {
        // TODO: Truy vấn và trả về danh sách nhân viên
    }

    // Các phương thức khác như themNhanVien, suaNhanVien, xoaNhanVien, timKiemNhanVien...

    public function hienThiChiTietLuongThang($maNv) {
        // TODO: Truy vấn và hiển thị chi tiết lương tháng của nhân viên
    }

    public function tongHopThongTinNam() {
        // TODO: Tổng hợp thông tin số ngày công và tổng lương đã nhận của từng nhân viên trong 1 năm
    }
}

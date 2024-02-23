<?php
include_once('db_connection.php'); // Kết nối đến cơ sở dữ liệu
include_once('NhanVien.php');
include_once('LuongThang.php');

$conn = new mysqli('localhost', 'username', 'password', 'ten_database');
if ($conn->connect_error) {
    die("Kết nối thất bại: " . $conn->connect_error);
}

$nhanVien = new NhanVien($conn);
$luongThang = new LuongThang($conn);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>Quản lý nhân viên</title>
</head>
<body>
    <!-- Giao diện Bootstrap -->
    <div class="container mt-5">
        <!-- Hiển thị danh sách nhân viên -->
        <?php $nhanVien->getDanhSachNhanVien(); ?>

        <!-- Thêm, sửa, xóa, tìm kiếm form... -->

        <!-- Hiển thị chi tiết lương tháng -->
        <?php $nhanVien->hienThiChiTietLuongThang($maNv); ?>

        <!-- Tổng hợp thông tin năm -->
        <?php $nhanVien->tongHopThongTinNam(); ?>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

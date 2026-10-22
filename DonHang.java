public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    // Constructor nhận đủ 3 giá trị
    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        // Quy tắc: số lượng nhỏ hơn 1 thì tự sửa thành 1
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    // Phương thức tính thành tiền
    public double tinhThanhTien() {
        double tong = sanPham.getDonGia() * soLuong;
        // Mua từ 5 cái trở lên được giảm 10%
        if (soLuong >= 5) {
            tong = tong * 0.9;
        }
        return tong;
    }

    // Phương thức in đơn hàng
    public void inDonHang() {
        double thanhTien = tinhThanhTien();
        if (soLuong >= 5) {
            System.out.printf("%-8s | %-16s | %-3d | %.0f%n", tenKhach, sanPham.getTenSP(), soLuong, thanhTien);
            System.out.println("         |                  |     | (đã giảm 10%)");
        } else {
            System.out.printf("%-8s | %-16s | %-3d | %.0f%n", tenKhach, sanPham.getTenSP(), soLuong, thanhTien);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Dùng new tạo 3 đối tượng SanPham theo kịch bản
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot = new SanPham("SP02", "Chuột không dây", 200000, 50);
        SanPham taiNghe = new SanPham("SP03", "Tai nghe");

        // 2. Gọi setter đặt giá, tồn kho cho Tai nghe; gọi hienThi() cho cả 3 sản phẩm
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();
        System.out.println();

        // 3. Tạo 3 đối tượng DonHang, truyền đối tượng SanPham vào constructor
        DonHang don1 = new DonHang("An", banPhim, 2);
        DonHang don2 = new DonHang("Bình", chuot, 5);
        DonHang don3 = new DonHang("Chi", taiNghe, 0);

        // 4. Gọi inDonHang() cho từng đơn
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-8s | %-16s | %-3s | %s%n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}

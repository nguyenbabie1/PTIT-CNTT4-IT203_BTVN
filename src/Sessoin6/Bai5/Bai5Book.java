package Sessoin6.Bai5;

public class Bai5Book {
    String maSach;
    String tenSach;
    double gia;

    // Constructor có tham số TRÙNG TÊN với thuộc tính
    public Bai5Book(String maSach, String tenSach, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá: " + gia);
        System.out.println("--------------------");
    }
}

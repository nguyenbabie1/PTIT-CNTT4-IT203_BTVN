package Sessoin6.Bai1;

public class Bai1Student {
    String maSV;
    String tenSV;
    int namSinh;
    double diemTB;

    public Bai1Student(String maSV, String tenSV, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Họ tên: " + tenSV);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("--------------------");
    }
}

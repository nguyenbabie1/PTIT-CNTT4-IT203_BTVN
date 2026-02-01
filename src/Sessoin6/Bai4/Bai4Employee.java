package Sessoin6.Bai4;

public class Bai4Employee {
        String maNV;
        String tenNV;
        double luong;

        public Bai4Employee() {
            this.maNV = "Chưa có";
            this.tenNV = "Chưa có";
            this.luong = 0;
        }
        public Bai4Employee(String maNV, String tenNV) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.luong = 0;
        }

        public Bai4Employee(String maNV, String tenNV, double luong) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.luong = luong;
        }

        public void hienThiThongTin() {
            System.out.println("Mã NV: " + maNV);
            System.out.println("Tên NV: " + tenNV);
            System.out.println("Lương: " + luong);
            System.out.println("----------------------");
        }
    }


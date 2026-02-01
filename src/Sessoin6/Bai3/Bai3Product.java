package Sessoin6.Bai3;

public class Bai3Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Bai3Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }
    public void KiemTraGia(double giaMoi) {

        if (giaMoi > 0) {
            this.giaBan = giaMoi;
            System.out.println("Ngon luonm");
        } else {
            System.out.println("gia re khong ngon>0");
        }

    }
    public void printInfo() {
        System.out.println("Mã sản phẩm:" + maSP);
        System.out.println("Tên sản phẩm:" + tenSP);
        System.out.println("Giá bán:" + giaBan);
    }
}

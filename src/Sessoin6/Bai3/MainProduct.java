package Sessoin6.Bai3;

public class MainProduct {
    static void main(String[] args) {
        Bai3Product sp = new Bai3Product("SP01", "Bút bi", 5000);
        sp.printInfo();
        sp.KiemTraGia(4000);
        sp.printInfo();
        sp.KiemTraGia(-1000);
    }

}

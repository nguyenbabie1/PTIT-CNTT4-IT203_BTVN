package Sessoin6.Bai5;

public class MainBook {
    public static void main(String[] args) {
        Bai5Book book1 = new Bai5Book("B001", "Lập trình Java", 120000);
        Bai5Book book2 = new Bai5Book("B002", "Cấu trúc dữ liệu", 150000);

        book1.hienThiThongTin();
        book2.hienThiThongTin();
    }
}
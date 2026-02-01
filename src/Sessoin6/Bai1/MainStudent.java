package Sessoin6.Bai1;

public class MainStudent {
    public static void main(String[] args) {
        Bai1Student sv1 = new Bai1Student("SV001", "Nguyễn Văn A", 2004, 8.5);
        Bai1Student sv2 = new Bai1Student("SV002", "Trần Thị B", 2003, 7.9);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}

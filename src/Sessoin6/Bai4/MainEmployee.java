package Sessoin6.Bai4;

    public class MainEmployee {
        public static void main(String[] args) {

            // Dùng constructor không tham số
            Bai4Employee nv1 = new Bai4Employee();

            // Dùng constructor có mã và tên
            Bai4Employee nv2 = new Bai4Employee("NV001", "Nguyễn Văn A");

            // Dùng constructor đầy đủ
            Bai4Employee nv3 = new Bai4Employee("NV002", "Trần Thị B", 15000000);

            nv1.hienThiThongTin();
            nv2.hienThiThongTin();
            nv3.hienThiThongTin();
        }
    }



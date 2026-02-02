package Sessoin7.Bai4;

public class MainClassroom {
    public static void main(String[] args) {

        Bai4Classroom s1 = new Bai4Classroom("Nguyen");
        Bai4Classroom s2 = new Bai4Classroom("Trang");
        Bai4Classroom s3 = new Bai4Classroom("Minh");

        s1.DongQuy(100_000);
        s2.DongQuy(150_000);
        s3.DongQuy(200_000);

        Bai4Classroom.showClassFund();
    }
}

package Sessoin7.Bai1;

public class MainStudent {
    public static void main(String[] args) {
        Bai1Student s1 = new Bai1Student("SV01", "Nguyen Van A");
        Bai1Student s2 = new Bai1Student("SV02", "Tran Thi B");
        Bai1Student s3 = new Bai1Student("SV03", "Le Van C");

        s1.displayStudent();
        System.out.println();

        s2.displayStudent();
        System.out.println();

        s3.displayStudent();
        System.out.println();

        Bai1Student.displayTotalStudent();
    }
}

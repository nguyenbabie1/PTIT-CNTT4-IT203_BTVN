package Sessoin7.Bai1;

public class Bai1Student {
    private String studentId;
    private String studentName;

    private static int totalStudent = 0;

    public Bai1Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void displayStudent(){
        System.out.println("Tên Sinh viên:"+ studentId);
        System.out.println("Mã sinh viên:"+studentName);
    }
    public static void displayTotalStudent(){
        System.out.println("Tong so sinh viên:" + totalStudent);
    }
}

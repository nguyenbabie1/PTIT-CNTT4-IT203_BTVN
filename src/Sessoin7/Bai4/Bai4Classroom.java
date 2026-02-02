package Sessoin7.Bai4;

public class Bai4Classroom {
    private String Stu_Name;

    private static double classFund = 0;

    public Bai4Classroom(String Stu_Name) {
        this.Stu_Name = Stu_Name;
    }
    public void DongQuy(double amount){
        if(amount > 0){
            classFund += amount;
            System.out.println(Stu_Name + "Da dong" + amount + "vao quỹ lớp");
        }
    }
    public static void showClassFund(){
        System.out.println("Tong quy hien tai:" + classFund);
    }
}

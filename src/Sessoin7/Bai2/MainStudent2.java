package Sessoin7.Bai2;

public class MainStudent2 {
  public static void main(String[] args) {
      int a = 10;
      int b = a;
      b = 20;
      System.out.println("a= " + a + "b= " + b);

      Bai2Student s1 = new Bai2Student();
      s1.name = "Doan Trung Nguyen";

      Bai2Student s2 = s1;
      s2.name = "Vu Thu Trang";

      System.out.println("Ten1 = " + s1.name);
      System.out.println("Ten2 = " + s2.name);
  }
}

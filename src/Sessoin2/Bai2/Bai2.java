package Sessoin2.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap text the loai sach (A,B,C,D)");
        String text = sc.next();
        switch (text){
            case "A":
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case "B":
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case "C":
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case "D":
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default: System.out.println("Khong co sach nay");
        }
    }
}

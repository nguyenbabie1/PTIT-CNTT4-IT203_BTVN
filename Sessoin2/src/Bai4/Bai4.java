package Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma id sach moi (phai>0)");
        int Book_id = sc.nextInt();
        do {
            System.out.println("Khong ngon ");
            Book_id = sc.nextInt();
        }while (Book_id<=0);
            System.out.println("Ngon");
    }
}

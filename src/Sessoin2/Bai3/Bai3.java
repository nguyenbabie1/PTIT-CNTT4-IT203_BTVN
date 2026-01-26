package Sessoin2.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach tra muon:");
        int books = sc.nextInt();
        int total = 0;

        int i;
        for (i = 1; i <= books; i++) {
            System.out.println("Nhap so ngay tre cua cuon thu  "+i);
             int day = sc.nextInt();

            total += day* 5000;
        }
        System.out.println("Tong tien phat: "+total);
    }
}

package Bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay tre (999 de ket thuc):");

        int uyTin = 100;
        int ngayTre = sc.nextInt();
        while (ngayTre != 999) {
            if (ngayTre <= 0) {
                uyTin += 5;
            } else {
                uyTin -= ngayTre * 2;
            }
            System.out.println("Nhap so ngay tre (999 de ket thuc):");
            ngayTre = sc.nextInt();
        }
        System.out.println("Tong diem uy tin: " + uyTin);
        if (uyTin > 120) {
            System.out.println("Xep loai: Doc gia Than thiet");
        } else if (uyTin >= 80) {
            System.out.println("Xep loai: Doc gia Tieu chuan");
        } else {
            System.out.println("Xep loai: khong ngon dau");
        }
    }
}

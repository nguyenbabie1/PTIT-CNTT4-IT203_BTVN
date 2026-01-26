package Sessoin1.Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD): ");
        double giaSach = sc.nextDouble();
        System.out.print("Nhap ty gia (VND/USD): ");
        float tyGia = sc.nextFloat();
        double tongTien = giaSach * tyGia;
        long tienVND = (long) tongTien;
        System.out.println("Tong tien (VND): " + tienVND);
    }
}

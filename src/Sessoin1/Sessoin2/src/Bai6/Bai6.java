package Bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int min = -1;
        int tong = 0;
        int dem = 0;
        for (int i = 2; i <= 8; i++) {
            System.out.println("Nhap luot muon ngay thu " + i + ":");
            int luot = sc.nextInt();
            if (luot == 0) {
                continue;
            }
            if (dem == 0) {
                max = luot;
                min = luot;
            } else {
                if (luot > max) {
                    max = luot;
                }
                if (luot < min) {
                    min = luot;
                }
            }
            tong += luot;
            dem++;
        }
        if (dem == 0) {
            System.out.println("Khong co ngay mo cua");
        } else {
            double trungBinh = (double) tong / dem;
            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh: " + trungBinh);
        }
    }
}

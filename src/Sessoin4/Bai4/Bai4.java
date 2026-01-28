package Sessoin4.Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma the:");
        String id = sc.nextLine().trim();

        if (!id.startsWith("TV")) {
            System.out.println("Thieu tien to TV");
        }
        else if (!id.startsWith("TV2023")) {
            System.out.println("Nam khong hop le");
        }
        else if (id.length() != 11) {
            System.out.println("Thieu 5 chu so cuoi");
        }
        else {
            System.out.println("Ma the hop le");
        }
    }
}

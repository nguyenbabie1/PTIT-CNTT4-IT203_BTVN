package Sessoin1.Bai5;

import java.util.Scanner;

public class bai5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap ma sach 4 chu so");
            int code = sc.nextInt();

            int thousand = code / 1000;
            int hundred = (code / 100) % 10;
            int ten = (code / 100) % 10;
            int one = code % 10;

            int sum = thousand + hundred + ten + one;
            boolean isVaild = (sum % 10) == one;
            System.out.println("so chu so cua ma sach la: "+ sum);

        }
}

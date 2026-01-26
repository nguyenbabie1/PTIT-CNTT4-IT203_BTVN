package Sessoin1.Bai2;

import java.util.Scanner;

public class Bai2ss1Calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Nhập số ngày chậm
        System.out.print("Nhập số ngày chậm trễ (n):");
        int n = sc.nextInt();
        System.out.print("Nhâp số lượng sách đã mượn (m):");
        int m = sc.nextInt();
        double total = n * m * 5000;
        if (n > 7 && m >=3) {
            total = total * 1.2;

        }
        boolean isBlocked = total > 50000;

        // in kets qua
        System.out.println("\n===== KẾT QUẢ TÍNH TIỀN PHẠT =====");
        System.out.println("\nSsố ngày chậm trễ "+ n);
        System.out.println("\nSố sách đã mượn "+m );
        System.out.printf("\nTông tiền phạt : %.2f\n", total);
        System.out.println("\nYêu cầu khóa thẻ:" + isBlocked);
    }
}
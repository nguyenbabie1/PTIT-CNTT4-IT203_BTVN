package Sessoin4.Bai3;

public class Bai3 {
    public static void main(String[] args) {

        String[] transactions = {
                "BH001-20/01",
                "BK008-21/01",
                "VG099-22/01"
        };

        for (int i = 0; i < transactions.length; i++) {
            StringBuilder sb = new StringBuilder("Giao dich: ");
            sb.append(transactions[i]);
            System.out.println(sb);
        }
    }
}

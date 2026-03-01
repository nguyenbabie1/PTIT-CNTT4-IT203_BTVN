package Sessoin14.Bai2;

import java.util.HashMap;
import java.util.Scanner;

public class DanhMucThuoc {
    public static void main(String[] args){
        HashMap<String,String> Painkiller = new HashMap<>();
        Painkiller.put("T01-","Trị tích phân");
        Painkiller.put("T02-","Thuốc trị hách nôi");
        Painkiller.put("T03-","Paracetamol.");
        Painkiller.put("T04-", "Aspirin");
        Painkiller.put("T05-", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã thuốc:");
        String maThuoc = sc.nextLine();

        if (Painkiller.containsKey(maThuoc)) {
            System.out.println("Tên thuốc: " + Painkiller.get(maThuoc));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }

        sc.close();
    }
}

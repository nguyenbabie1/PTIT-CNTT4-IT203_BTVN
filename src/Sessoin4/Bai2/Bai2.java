package Sessoin4.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nha mo tả
        System.out.println( "Nhap mo ta sach: ");
        String DCT = sc.nextLine();

        // kiem tra text chưas từ 'kệ' không
         if(DCT.contains("Kệ")){

             String vitri = DCT.replaceAll(".*Kệ:\\s*([^,\\n ]+).* ", "$1");

             //in vi tri tim thay
             System.out.println("Vi tri tim thay: " + vitri);
             // thay the text
              String newDCT=DCT.replace("Kệ:","vị trí lưu trữ:");
              // in mo ta mới
             System.out.println("Mô tả mới:'" +newDCT);

         }else{
             System.out.println("khong gion dau");
         }

    }
}

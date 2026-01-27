package Sessoin3.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books ={
                "Nguyen",
                "Duyen",
                "Bao Anh",
                "Nhi",
                "Mai"
        };
        System.out.println("Nhap ten danh sach can tim:");
        String search = sc.nextLine();
        int result = searchBooks(books, search);
            if (result != -1) {
                System.out.println("tim thay vi tri " + result +1);
            }else{
                System.out.println("Khong tim thay");
            }
    }
}
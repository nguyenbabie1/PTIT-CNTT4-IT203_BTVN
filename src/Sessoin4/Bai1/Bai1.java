package Sessoin4.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static String capsLock(String str) {
        str = str.trim().replaceAll("\\s+", " ");
        if (str.isEmpty()) return "";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten sach:");
        String title = capsLock("["+sc.nextLine().trim().toUpperCase()+"]");

        System.out.println("Nhap ten tac gia:");
        String author = capsLock(sc.nextLine());


        System.out.println("Nhap the loai:");
        String category =  capsLock(sc.nextLine().trim());

        System.out.println("Sach: " + title + " - Tac gia: " + author + " - The loai: " + category);
    }

}

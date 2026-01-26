package Sessoin3.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static int[] addBookToLibraries(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sach thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach n: ");
        int n = scanner.nextInt();
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
    }
}

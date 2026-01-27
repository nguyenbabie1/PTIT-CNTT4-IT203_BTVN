package Sessoin3.Bai4;

public class Bai4 {
    public static void sortBooks(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Du lieu khong hop le");
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Du lieu khong hop le");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] isbnCodes = {105, 102, 109, 101, 103};
        System.out.println("truoc khi sap xep:");
        displayBooks(isbnCodes);
        sortBooks(isbnCodes);
        System.out.println(" sau khi sap xep:");
        displayBooks(isbnCodes);
    }
}

package Sessoin3.Bai3;

public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length == 0 || quantities.length == 0
                || names.length != quantities.length) {
            System.out.println("Du lieu khong hop le");
            return;
        }

        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sach co so luong nhieu nhat:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(names[i] + " - " + quantities[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        if (names == null || quantities == null || names.length == 0 || quantities.length == 0
                || names.length != quantities.length) {
            System.out.println("Du lieu khong hop le");
            return;
        }

        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sach co so luong it nhat:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(names[i] + " - " + quantities[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Java Core", "Python Basics", "C++ Primer", "Java Core", "Clean Code"};
        int[] quantities = {10, 5, 10, 2, 2};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}

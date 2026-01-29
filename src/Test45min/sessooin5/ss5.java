package Test45min.sessooin5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ss5 {
    static String[] msvList = new String[10];
    static int msvCount = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";
    static final Pattern pattern = Pattern.compile(MSSV_REGEX);

    static Scanner sc = new Scanner(System.in);

    private static void showMenu() {
        System.out.println("======Quan ly ma sinh vien======");
        System.out.println("1. Hien thi");
        System.out.println("2. Them moi");
        System.out.println("3. Xoa");
        System.out.println("4. Tim kiem");
        System.out.println("5. Cap nhat");
        System.out.println("6. Thoat");
    }

    private static void showList() {
        System.out.println("Danh sach ma sinh vien");
        if (msvCount == 0) {
            System.out.println("(Trong)");
            return;
        }
        for (int i = 0; i < msvCount; i++) {
            System.out.println(i + ": " + msvList[i]);
        }
    }

    private static String inputMsv() {
        while (true) {
            System.out.print("Nhap MSSV (vd: B2101234): ");
            String msv = sc.nextLine().trim();
            if (pattern.matcher(msv).matches()) {
                return msv;
            }
            System.out.println("MSSV khong dung dinh dang. Vui long nhap lai.");
        }
    }

    private static void addMsv() {
        if (msvCount >= msvList.length) {
            System.out.println("Danh sach da day, khong the them moi.");
            return;
        }
        String msv = inputMsv();
        msvList[msvCount++] = msv;
        System.out.println("Da them MSSV: " + msv);
    }

    private static void updateMsv() {
    }

    private static void deleteMsv() {
        if (msvCount == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.print("Nhap MSSV can xoa: ");
        String target = sc.nextLine().trim();
        int found = -1;
        for (int i = 0; i < msvCount; i++) {
            if (msvList[i].equalsIgnoreCase(target)) {
                found = i;
                break;
            }
        }
        if (found == -1) {
            System.out.println("Khong tim thay MSSV: " + target);
            return;
        }
        for (int i = found; i < msvCount - 1; i++) {
            msvList[i] = msvList[i + 1];
        }
        msvList[msvCount - 1] = null;
        msvCount--;
        System.out.println("Da xoa MSSV: " + target);
    }

    private static void searchMsv() {

    }

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("Chon chuc nang: ");
            String choiceText = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(choiceText);
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le.");
                choice = -1;
            }

            switch (choice) {
                case 1:
                    showList();
                    break;
                case 2:
                    addMsv();
                    break;
                case 3:
                    deleteMsv();
                    break;
                case 4:
//                    searchMsv();
                    break;
                case 5:
//                    updateMsv();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 6);
    }
}

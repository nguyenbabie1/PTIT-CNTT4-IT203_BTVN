package Test45min.sessooin8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    private static String normalizeRank(String value) {
        return value.trim().replaceAll("\\s+", " ").toLowerCase();
    }

    private static int rankValue(String rank) {
        String normalized = normalizeRank(rank);
        if ("gioi".equals(normalized)) {
            return 4;
        }
        if ("kha".equals(normalized)) {
            return 3;
        }
        if ("trung binh".equals(normalized)) {
            return 2;
        }
        if ("yeu".equals(normalized)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.println("==================================");
            System.out.print("Chon chuc nang: ");

            if (!sc.hasNextInt()) {
                System.out.println("Lua chon khong hop le!");
                sc.nextLine();
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("So luong khong hop le!");
                        sc.nextLine();
                        break;
                    }
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien " + (i + 1) + ":");
                        System.out.print("Ma: ");
                        String id = sc.nextLine();
                        System.out.print("Ten: ");
                        String name = sc.nextLine();
                        System.out.print("Diem: ");
                        if (!sc.hasNextDouble()) {
                            System.out.println("Diem khong hop le, bo qua sinh vien nay.");
                            sc.nextLine();
                            continue;
                        }
                        double score = sc.nextDouble();
                        sc.nextLine();
                        students.add(new Student(id, name, score));
                    }
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
}

package Sessoin14.Bai1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class BenhNhan {
    public static void main (String[] args) {
        //mảng chưa danh sách bệnh nhân
        String[] input = {"Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"};
        Set<String> DanhSach = new LinkedHashSet<>();

        Collections.addAll(DanhSach, input);
        System.out.println("Danh sách gọi khám:");

        for (String ten : DanhSach) {
            System.out.println(ten);
        }
    }
}

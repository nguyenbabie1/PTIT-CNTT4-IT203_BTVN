package Sessoin13.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyDanhMucThuoc {

    public static List<String> locVaSapXepThuoc(List<String> danhSachNhap) {

        ArrayList<String> danhSachKhongTrung = new ArrayList<>();

        for (String thuoc : danhSachNhap) {
            if (!danhSachKhongTrung.contains(thuoc)) {
                danhSachKhongTrung.add(thuoc);
            }
        }

        Collections.sort(danhSachKhongTrung);
        return danhSachKhongTrung;
    }
}
package Sessoin14.Bai3;
import java.util.HashSet;
import java.util.Set;

public class KiemTraThuoc {
    public static void main(String[] args) {

        //SetA:thành phần thuốc mới
        Set<String> thuocMoi = new HashSet<>();
        thuocMoi.add("Aspirin");
        thuocMoi.add("Caffeine");
        thuocMoi.add("Paracetamol");
        thuocMoi.add("Penicillin");
        thuocMoi.add("Pollen");
        //SetB:chất bệnh nhân bị dị ứng
        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        Set<String> canhBao = new HashSet<>(thuocMoi);
        canhBao.retainAll(diUng);
        Set<String> anToan = new HashSet<>(thuocMoi);
        anToan.removeAll(diUng);
        // in kết quả
        System.out.println("Thuốc: " + thuocMoi);
        System.out.println("Dị ứng: " + diUng);
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}
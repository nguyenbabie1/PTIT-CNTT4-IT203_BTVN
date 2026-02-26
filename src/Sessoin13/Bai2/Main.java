package Sessoin13.Bai2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );

        System.out.println("Input: " + input);

        List<String> output = QuanLyDanhMucThuoc.locVaSapXepThuoc(input);

        System.out.println("Output: " + output);
    }
}
package Sessoin13.Bai3;

import java.util.ArrayList;
import java.util.List;

public class TimBenhNhanTrungKhop {
        public static <T> List<T> timBenhNhan(List<T> ListA,List<T> ListB) {
            List<T> result = new ArrayList<>();
            for (T item : ListA) {
                if (ListB.contains(item)) {
                    result.add(item);
                }
            }
            return result;
        }
}

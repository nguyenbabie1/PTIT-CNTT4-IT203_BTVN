package Test45min.sessoin16;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new ElectronicProduct("E01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("E02", "Tai nghe", 2000000, 6));
        repo.add(new FoodProduct("F01", "Bánh mì", 20000, 10));
        repo.add(new FoodProduct("F02", "Sữa tươi", 30000, 5));


        System.out.println("Danh sách sản phẩm");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
        }

        System.out.println("Tìm sản phẩm");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
            System.out.println("Thành tiền: " + found.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy!");
        }

        System.out.println("Sắp xếp theo giá tăng dần");

        List<Product> sortedList = new ArrayList<>(repo.findAll());

        Collections.sort(sortedList, new Comparator<Product>(){
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        for (Product p : sortedList) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
        }
        System.out.println("Thống kê theo loại:");
        Map<String, Integer> statistics = repo.countByType();
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

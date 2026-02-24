package Test45min.sessooin11;

public class Main {
    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];

        // Khởi tạo dữ liệu
        drinks[0] = new Coffe("CF01", "Cà phê chồn", 30000, true);
        drinks[1] = new FruitJuice("FJ01", "Nước cam", 40000, 10);
        drinks[2] = null;

        System.out.println("===== HÓA ĐƠN =====");

        for (int i = 0; i < drinks.length; i++) {

            if (drinks[i] != null) {
                System.out.println("-------------------");

                drinks[i].displayInfo();
                System.out.println("Thành tiền: " + drinks[i].calculatePrice());

                if (drinks[i] instanceof IMixable) {
                    IMixable mixable = (IMixable) drinks[i];
                    mixable.mix();
                }
            }
        }
    }
}
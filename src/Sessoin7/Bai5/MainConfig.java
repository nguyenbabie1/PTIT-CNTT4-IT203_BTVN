package Sessoin7.Bai5;

public class MainConfig {
    public static void main(String[] args) {

        double score = 8.5;

        if (score >= Bai5Config.MIN_SCORE && score <= Bai5Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem khong hop le!");
        }
    }
}

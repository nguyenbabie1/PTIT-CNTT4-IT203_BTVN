package Sessoin7.Bai3;

public class Bai3ScoreUtils {
    public static boolean CheckPass(double score){
        return score >= 0.5;
    }
    public static double tinhTrungBinh(double[] scores){
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}

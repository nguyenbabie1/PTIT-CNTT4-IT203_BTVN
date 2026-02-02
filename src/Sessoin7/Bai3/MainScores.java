package Sessoin7.Bai3;

import com.sun.security.jgss.GSSUtil;

public class MainScores {
    public static void main(String[] args) {
        double[] scores = {6.5,8.0,4.5};

        System.out.println("Danh sach diem:6.5,8.0,4.5");
        System.out.println("Ket qua xu ly:");

        double average = Bai3ScoreUtils.tinhTrungBinh(scores);
        System.out.println("Trung binh: " + average);

        for (double score : scores) {
            if(Bai3ScoreUtils.CheckPass(score)){
                System.out.println("Diem " + score + " Ngon");
            }else{
                System.out.println("Diem " + score + " Khong ngon");
            }
        }
    }
}

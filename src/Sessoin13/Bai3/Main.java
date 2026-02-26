package Sessoin13.Bai3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Sessoin13.Bai3.TimBenhNhanTrungKhop.timBenhNhan;

public class Main {
    public static void main(String[] args){
        //Test case 1
        List<Integer> noiKhoaIDs = Arrays.asList(101,102,105);
        List<Integer> ngoaiKhoaIDs = Arrays.asList(102,105,108);

        List<Integer> commonIDs = timBenhNhan(noiKhoaIDs,ngoaiKhoaIDs);
        System.out.println("Test case output:" + commonIDs);
        //Test case 2
        List<String> noiKhoaBHYT = Arrays.asList("DB01","DN02","DN03");
        List<String> ngoaiKhoaBHYT = Arrays.asList("DN02","DN04");

        List<String> commonBHYT = timBenhNhan(noiKhoaBHYT,ngoaiKhoaBHYT);
        System.out.println("Test case output:" + commonBHYT);
    }
}

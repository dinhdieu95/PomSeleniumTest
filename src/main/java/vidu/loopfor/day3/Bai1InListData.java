package vidu.loopfor.day3;

import java.util.Scanner;

public class Bai1InListData {

    public static void main(String[] args) {

        printWay2();

    }
    //    in ra từng phần tử trong mảng
    public static void printWay1() {
        int[] numbers = {5, 10, 15, 20, 25};
        for (int i = 0; i < numbers.length; i++) { //0 numbers[0] = 5
            System.out.println("Phần tử tại vị trí " + i + " là: " + numbers[i]);
        }

    }

    //  cách 2:  Hàm for each
// Hàm để in số phần tử trong mảng
    public static void printWay2() {
        String[] names = {"Tuan", "Linh", "Trang", "Hung", "Mai"};
        // Sử dụng vòng lặp for-each để duyệt qua mảng
        for (String num : names) {
            System.out.println("Tên bạn: " + num);
        }
    }


}



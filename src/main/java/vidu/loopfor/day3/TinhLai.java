package vidu.loopfor.day3;

import java.util.Scanner;

public class TinhLai {
    public static double sumRate(double goc, double lai, double fee) {
        return goc * lai + fee;
    }

    public static void sumGoc() {
        System.out.println("Nhập số gốc khoản vay: ");
        Scanner scanner = new Scanner(System.in);
        double goc = scanner.nextDouble();
        System.out.println("Nhập số lãi suất:  ");
        double lai = scanner.nextDouble();
        System.out.println("Nhập số fee:  ");
        double fee = scanner.nextDouble();
        System.out.println("Số lãi phải trả " + sumRate(goc, lai, fee));
    }

    public static void main(String[] args) {
        sumGoc();
    }
}

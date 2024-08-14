package vidu.loopfor.day3;

import java.util.Scanner;

public class Bai3 {
    // Hàm tính giai thừa của một số nguyên không âm
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Số nhập vào phải là số nguyên không âm.");
            return 0;
        }

        long result = 1; // Khởi tạo kết quả giai thừa

        // Tính giai thừa bằng cách nhân liên tiếp
        for (int i = 1; i <= n; i++) {
            result *= i; //(result = result * i)
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên không âm từ người dùng
        System.out.print("Nhập một số nguyên không âm: ");
        int n = scanner.nextInt();

        try {
            // Gọi hàm để tính giai thừa
            long fact = factorial(n);

            // In kết quả
            System.out.println("Giai thừa của " + n + " là: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

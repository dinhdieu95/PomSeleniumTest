package vidu.loopfor.day3;

import java.util.Scanner;

public class Bai2TongSoChan {
    // Hàm để tính tổng các số chẵn từ 1 đến n
    public static int sumEvenNumbers(int n) {
        int sum = 0; // Khởi tạo biến tổng

//        // Duyệt qua các số chẵn từ 2 đến n
//        for (int i = 2; i <= n; i += 2) { //i = 2  n =5   i = 4  i =6
//            sum += i; // Cộng từng số chẵn vào tổng sum =sum +i = 0 +2 =2   sum = 2 +  4 = 6
//        }

//        for (int i = 2; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }

// Duyệt qua các số lẻ từ 2 đến n
        for (int i = 1; i <= n; i += 2) { //i = 1  n =5   i = 3  i =5
            sum += i; // Cộng từng số lẻ vào tổng sum =sum +i = 0 +1 =1   sum =1 +  3 = 4 sum = 4 +5 = 9
        }
        return sum; // Trả về tổng
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị n từ người dùng
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        // Gọi hàm để tính tổng các số chẵn từ 1 đến n
        int totalSum = sumEvenNumbers(n);

        // In tổng các số chẵn
        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + totalSum);

        scanner.close();
    }
}

package vidu.loopfor.day3;

import java.util.Scanner;

public class Bai6InTamGiacCan {

    // Hàm để in khoảng trắng
    public static void printSpaces(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
    }

    // Hàm để in dấu *
    public static void printStars(int n) {
        for (int k = 1; k <= n; k++) {
            System.out.print("*");
        }
    }

    // Hàm để in tam giác cân
    public static void printPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng trước các dấu *
            printSpaces(height - i);

            // In dấu *
            printStars(2 * i - 1);

            // Xuống dòng sau khi hoàn thành mỗi hàng
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        System.out.print("Nhập Chiều cao của tam giác cân: ");
        int height = scanner.nextInt();

        // Gọi hàm để in tam giác cân
        printPyramid(height);
    }
}

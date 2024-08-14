package vidu.loopfor.exam;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // In từng ký tự trong chuỗi
        System.out.println("Các ký tự trong chuỗi là:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        scanner.close();
    }
}

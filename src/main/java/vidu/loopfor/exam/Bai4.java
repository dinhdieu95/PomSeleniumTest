package vidu.loopfor.exam;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Đếm số từ trong chuỗi
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                inWord = false;
            } else {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            }
        }

        // In số lượng từ
        System.out.println("Số lượng từ trong chuỗi là: " + wordCount);

        scanner.close();
    }
}

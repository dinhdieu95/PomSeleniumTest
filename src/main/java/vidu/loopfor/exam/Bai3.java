package vidu.loopfor.exam;


import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Đếm số lượng nguyên âm
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        // In số lượng nguyên âm
        System.out.println("Số lượng nguyên âm trong chuỗi là: " + vowelCount);

        scanner.close();
    }
}

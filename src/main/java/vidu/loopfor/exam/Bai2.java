package vidu.loopfor.exam;


import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Đảo ngược chuỗi
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // In chuỗi đảo ngược
        System.out.println("Chuỗi đảo ngược là: " + reversed);

        scanner.close();
    }
}

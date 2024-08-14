package vidu.loopfor.day3;


import java.util.Arrays;
import java.util.Scanner;

public class Bai7SapXep {

    // Hàm để sắp xếp mảng bằng thuật toán sắp xếp nổi bọt
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi array[j] và array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Hàm để in mảng
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng với kích thước n
        int[] numbers = new int[n];

        // Nhập các số từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Đọc và lưu phần tử vào mảng
        }

        // Sử dụng phương thức Arrays.sort() để sắp xếp mảng
        Arrays.sort(numbers);

        // Hoặc sử dụng hàm bubbleSort để sắp xếp mảng
        // bubbleSort(numbers);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(numbers);

        scanner.close(); // Đóng scanner để giải phóng tài nguyên
    }
}

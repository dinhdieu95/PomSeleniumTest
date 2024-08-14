package vidu.loopfor.day3;

import java.util.Scanner;

public class Bai5TimMax {
    public static void main(String[] args) {
        int[] numbers = input(); // int[] numbers = {9, 6, 15, 16, 19} ;
        // Gọi hàm findMax để tìm số lớn nhất
        int max = findMax(numbers);
        // In ra số lớn nhất
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    // 5. Hàm để tìm số lớn nhất trong một mảng
    public static int findMax(int[] numbers) {
        int max = numbers[0]; // Giả sử phần tử đầu tiên của mảng là lớn nhất max = 9  =  numbers[0]

        for (int i = 1; i < numbers.length; i++) { // numbers có 5 phần tử 9 6 15 18 19
//            if (numbers[i] > max) { // Nếu phần tử hiện tại lớn hơn giá trị max hiện tại // i = 1 numbers[1]  = 6  , i =2  numbers[2] = 15
////                i =3  numbers[3] = 18 -> i =4  numbers[4] = 19
//                max = numbers[i]; // Cập nhật giá trị max   max  = numbers[2] = 15 , max =  numbers[3] = 18 , max = numbers[4] = 19
//            }
            max = Math.max(max, numbers[i]);
        }


        return max; // Trả về số lớn nhất
    }

    public static int[] input() {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt(); // Đọc số lượng phần tử của mảng
        int[] numbers = new int[n]; // Tạo mảng với kích thước n
        // Nhập các số từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Đọc và lưu phần tử vào mảng
        }
        return numbers;
    }
}

package vidu.loopfor.day3;

public class Bai2Sum {
    public static int sum1To10() {
        int sum = 0; // Biến để lưu tổng

        // Sử dụng vòng lặp for để tính tổng các số từ 1 đến 10
        for (int i = 1; i <= 10; i++) { //khởi_tạo; điều_kiện; bước_lặp
            sum += i; //(sum = sum + i) 0+1  1+2   sum +10 // Cộng giá trị của i vào sum
        }

        // In ra tổng
        System.out.println("Tổng của các số từ 1 đến 10 là: " + sum);
        return sum;
    }

    public static void main(String[] args) {
//    1. Tính tổng số nguyên từ 1 tới 10
        sum1To10();
    }
}

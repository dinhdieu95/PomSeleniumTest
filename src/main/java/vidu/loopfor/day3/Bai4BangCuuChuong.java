package vidu.loopfor.day3;

public class Bai4BangCuuChuong {
//    in ra bảng cửu chương của 1 số
    public static void calculator(int number) {
        System.out.println("multiplication table: " + number);
        for (int i = 1; i <= 10; i++) { // i =1  i=2
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void calculatorMulti() {
        System.out.println("multiplication table: ");
        for (int i = 1; i <= 10; i++) {   // calculator(1)
            calculator(i); //  calculator(1)  // calculator(2) ... // calculator(10)
        }
    }


    public static void main(String[] args) {


////    3.  in ra bảng cửu chương của 1 số
//        calculator(2);
////
////    4.  in ra bảng cửu chương
        calculatorMulti();
    }
}

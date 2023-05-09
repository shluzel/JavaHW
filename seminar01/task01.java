package seminar01;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println("Введите число N:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Тругольное число для N: " + triangleNumber(N));
        in.close();
    }

    static int triangleNumber(int Number) {
        int triangle = 0;
        triangle = (Number * (Number + 1)) / 2;
        return triangle;
    }
}
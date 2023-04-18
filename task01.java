//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
/**
 * task01
 */
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println("Введите число N:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Тругольное число для N: " + TriangleNumber(N));
        in.close();
    }

    static int TriangleNumber(int Number) {
        int triangle = 0;
        triangle = (Number * (Number + 1)) / 2;
        return triangle;
    }
}
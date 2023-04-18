//Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.println("Введите число N:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Факториал N: " + factorial(N));
        in.close();
    }
    static int factorial (int Number) {
        int fact = 1;
        for (int i = 1; i <= Number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

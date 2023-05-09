package seminar01;
//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        System.out.println("Введите число N:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Простые числа до N: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(simpleNumbers(i));
        }
        in.close();
    }
    static String simpleNumbers (int Number){
        int sum = 0;
        for (int i = 1; i < Number; i++) {
            if (Number % i == 0) {
                sum = sum +1;
            }
        }
        if (sum == 1) {
            return Integer.toString(Number) + " ";
        }
        else {
            return "";
        }
    }
}
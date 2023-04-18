//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.print("Введите первое число:");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.print("Введите второе число:");
        int second = in.nextInt();
        System.out.println("Введите операцию, которую хотите произвести (1: + сложение, 2:  - вычитание, 3: * умножение, 4: / деление):");
        int act = in.nextInt();
        System.out.println("Ваш ответ:" + someAction(first, second, act));
        in.close();
    }

    static String someAction (int a, int b, int operation) {
        double res = 0;
        if (operation == 1) {
            res = a + b;
            return Double.toString(res);
        }
        if (operation == 2){
            res = a - b;
            return Double.toString(res);
        }
        if (operation == 3){
            res = a / b;
            return Double.toString(res);
        }
        if (operation == 4){
            res = a * b;
            return Double.toString(res);
        }
        else{
            return "Неправильный ввод / Невозможно решить";
        }
    }

}
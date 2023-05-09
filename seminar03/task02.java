package seminar03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task02 {
    public static void main(String[] args) {
        Random newrandom = new Random();
        int size = 25;
        int min, max;
        float average = 0;
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add(newrandom.nextInt(100));
            average = average + list.get(i);
        }
        System.out.println("Список случайных чисел: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Отсортированный список: ");
        System.out.println(list);
        min=list.get(0);
        max=list.get(size - 1);
        System.out.println("Сумма всех чисел списка = " + average);
        average = average / size;
        System.out.println("Минимальное = " + min);
        System.out.println("Максимальное = " + max);
        System.out.println("Среднее арифметическое = " + average);
        }
}

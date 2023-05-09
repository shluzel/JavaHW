package seminar03;

import java.util.ArrayList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        Random newrandom = new Random();
        int size = 25;
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        ArrayList<Integer> evenList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add(newrandom.nextInt(100));
        }
        System.out.println("Исходный массив: ");
        System.out.println(list);
        for (int i = 0; i < size; i++) {
            if ((list.get(i) % 2) == 0) {
                evenList.add(list.get(i));
            }
        }
        list.removeAll(evenList);
        System.out.println("Массив, после удаления четных чисел: ");
        System.out.println(list);
    }
}

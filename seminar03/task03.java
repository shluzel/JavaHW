package seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task03 {
    public static void main(String[] args){
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер","Сатурн","Уран", "Нептун"};
        Random newrandom = new Random();
        ArrayList<String> repeatlist = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            repeatlist.add(planets[newrandom.nextInt(8)]);
        }
        System.out.println("Исходный список: ");
        System.out.println(repeatlist);
        System.out.println("Количество повторений для планет: ");
        Set <String> mySet = new HashSet<String>(repeatlist);
        for (String string : mySet) {
            System.out.println(string + " = " + Collections.frequency(repeatlist, string) + ";");
    }
}
}
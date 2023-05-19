package seminar05;

import java.util.HashMap;
import java.util.Map;

public class task01 {
    public static void main(String[] args) {

        Map<String, int[]> telephonebook = new HashMap<>();

        telephonebook.put("Иванов", new int[]{234561213});
        telephonebook.put("Петров", new int[]{321457382, 451726345});
        telephonebook.put("Сидоров", new int[]{273462912, 263675612});
        telephonebook.put("Павлов", new int[]{126374839, 102934728});
        telephonebook.put("Григорьев", new int[]{162731928});
        telephonebook.put("Анатольев", new int[]{732981728, 273641627, 231429821});

        for (var i : telephonebook.entrySet()){
            System.out.println("Фамилия: " + i.getKey() + phones(i.getValue()));
        }
    }

    public static StringBuilder phones(int[] value) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            res.append("\n телефон №" + (i + 1) + " - +79" + value[i]);
        }
        return res;
    }
    
}
package seminar05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task02 {
    public static void main(String[] args) {
        String str = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        System.out.println(sortnames(str));
    }

    public static Map sortnames(String str) {
        String longnames[] = str.split(", ");
        HashMap<String, Integer> names = new HashMap<>();
        for (String it : longnames) {
            String name = it.split(" ")[0];
            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }

        TreeMap<Integer, List<String>> res = new TreeMap<>();
        for (String it : names.keySet()) {
            if (res.containsKey(names.get(it))) {
                res.get(names.get(it)).add(it);
            } else {
                List<String> list = new ArrayList<>();
                list.add(it);
                res.put(names.get(it), list);
            }
        }
        return res.descendingMap();
    }
}
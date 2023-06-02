package seminar06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        ArrayList<laptop> listObject = new ArrayList<>();
        
        listObject.add(new laptop("i3", "windows", 4, 120));
        listObject.add(new laptop("i5", "macos", 4, 256));
        listObject.add(new laptop("i7", "windows", 16, 1000));
        listObject.add(new laptop("i5", "linux", 8, 500));
        listObject.add(new laptop("i5", "windows", 8, 500));
        listObject.add(new laptop("i9", "windows", 16, 2000));
        listObject.add(new laptop("i5", "macos", 8, 500));
        listObject.add(new laptop("i7", "linux", 16, 2000));
        listObject.add(new laptop("i5", "linux", 8, 1000));
        listObject.add(new laptop("i3", "windows", 4, 480));

        seach(listObject, choseparametr());
    }

    public static void seach(ArrayList<laptop> listObj, Map<String, String> searchedparametrs) {
        ArrayList<laptop> result = new ArrayList<>();
        if (searchedparametrs.isEmpty()) {
            System.out.println("Вы не ввели параметров для поиска.\n");
            seach(listObj, choseparametr());
        } else {
            var fields = searchedparametrs.keySet();
            for (Object field : fields) {
                for (laptop obj : listObj) {
                    if (obj.parametrsMap().get(field.toString()).toString()
                            .equals(searchedparametrs.get(field.toString()))) {
                        if (!result.contains(obj)) {
                            result.add(obj);
                        }
                    }
                }
            }
            
            for (Object field : fields) {
                ArrayList<laptop> param = new ArrayList<>(result);
                for (laptop obj : param) {
                    if (!obj.parametrsMap().get(field.toString()).toString()
                            .equals(searchedparametrs.get(field.toString()))) {
                        result.remove(obj);
                    }
                }
            }

            if (result.isEmpty()) {
                System.out.println("Результатов нет.");
            } 
            else {
                for (laptop obj : result) {
                    System.out.println(obj);
                }
            }
        }
    }

    public static Map<String, String> choseparametr() {
        Map<String, String> parametrs = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите искомый процессор (i3/ i5/ i7/ i9):");
        String param = scan.nextLine();
        if (!param.equals(""))
            parametrs.put("cpu", param.toLowerCase());

        System.out.println("Введите интересующую вас операционную систему (windows, linux, macos):");
        param = scan.nextLine();
        if (!param.equals(""))
            parametrs.put("oc", param.toLowerCase());

        System.out.println("Введите количество оперативной памяти (4, 8, 16):");
        param = scan.nextLine();
        if (!param.equals(""))
            parametrs.put("ram", param);

        System.out.println("Введите размер ssd в Гб (120, 256, 480, 500, 1000, 2000):");
        param = scan.nextLine();
        if (!param.equals(""))
            parametrs.put("ssd", param);
        scan.close();
        return parametrs;
    }
}

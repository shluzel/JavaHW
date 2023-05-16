import java.util.Arrays;
import java.util.LinkedList;

public class task01 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Изначальный список: " + list1);
        LinkedList<Integer> reversedlist = get_reversed_list(list1);
        System.out.println("Перевернутый (записанный в новый): " + reversedlist);

        System.out.println("Другой вариант");
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Изначальный список: " + list2);
        reverse_list(list2);
        System.out.println("Перевернутый: " + list2);
    }

    static LinkedList<Integer> get_reversed_list (LinkedList<Integer> linkedlist){
        LinkedList<Integer> reverse = new LinkedList<>();
        while (linkedlist.size() > 0){
            reverse.add(linkedlist.pollLast());
        }
        return reverse;
    }

    static void reverse_list (LinkedList<Integer> linkedlist){
        LinkedList<Integer> templist = new LinkedList<>();
        while (linkedlist.size() > 0){
            templist.add(linkedlist.pollLast());
        }
        while (templist.size() > 0){
            linkedlist.add(templist.pollFirst());
        }
    }
}
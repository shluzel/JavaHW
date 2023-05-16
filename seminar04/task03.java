import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class task03 {
    public static void main(String[] args) {
        LinkedList<Integer> newlist = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> i = newlist.iterator();

        int sum_elem = 0;

        while (i.hasNext()){
            sum_elem += i.next();
        }

        System.out.printf("Сумма всех элементов списка = %d ", sum_elem);
    }
}

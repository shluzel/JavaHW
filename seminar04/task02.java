import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Queue<Integer> newqueue = new LinkedList<Integer>();
        newqueue.add(15);
        newqueue.add(23);
        newqueue.add(11);
        newqueue.add(20);
        newqueue.add(15);
        newqueue.add(22);
        newqueue.add(9);
        
        System.out.println("Исходный список: " + newqueue); 

        enqueue(newqueue);
        System.out.printf("Список, с добавлением нового элемента в конец: ");
        System.out.println(newqueue);

        int queue_no_first = dequeue(newqueue);
        System.out.printf("Первый элемент = %d , в списке  удалён: ", queue_no_first);
        System.out.println(newqueue);

        int first_element = first(newqueue);
        System.out.printf("Первый элемент в списке: " + first_element);
     }

    private static int first(Queue<Integer> queue) {
        int first_elem = queue.peek();
        return first_elem;
    }

    private static int dequeue(Queue<Integer> queue) {
        int cut_queue = queue.remove();
        return cut_queue;
    }

    private static void enqueue(Queue<Integer> queue) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите элемент для добавления в список: ");
        int new_elem = sc.nextInt();
        queue.add(new_elem);
        sc.close();
    }  
}

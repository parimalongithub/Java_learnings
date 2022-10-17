import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(36);
        ad1.addFirst(2);
        ad1.removeFirst();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        
    }
}

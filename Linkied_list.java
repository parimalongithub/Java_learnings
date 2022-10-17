
import java.util.*;

public class Linkied_list {
    public static void main(String[] args) {
        LinkedList<Integer>m1=new LinkedList<>();
        LinkedList<Integer>m2=new LinkedList<>();
        m2.add(12);
        m2.add(21);
        m2.add(69);
        m1.add(6);
        m1.add(2);
        m1.add(1);
        m1.add(9);
        m1.add(9);

        m1.add(0,1);
        m1.add(0,0);
        m1.addAll(m2);
        m1.addLast(21);
        System.out.println(m1.indexOf(6));
        System.out.println(m1.indexOf(68));
        System.out.println(m1.indexOf(9));
        System.out.println(m1.lastIndexOf(9));
        System.out.println(m1.remove(0));



        System.out.println(m1.contains(6));
        for(int i=0;i<m1.size();i++){
            System.out.print(m1.get(i));
            System.out.print(", ");
    }
}
}






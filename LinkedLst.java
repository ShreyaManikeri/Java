import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {
        
        LinkedList l=new LinkedList<>();

        l.add("durga");
        l.add(34);
        l.add(null);
        l.addFirst("shreya");   //addFirst,addLast
        Object o=l.set(2, "maya");
        System.out.println(l);
        System.out.println(o);
    }
}

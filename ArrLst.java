import java.util.ArrayList;

public class ArrLst{
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("Pawan");
        l.add(null);       //null allowed
         l.add("Pawan");   //duplicates
         l.add(23);         //heterogeneous
        System.out.println(l);
    }
}
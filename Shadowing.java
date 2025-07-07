import java.util.Scanner;
public class Shadowing{
    //shadowing does not work for methods,only for clasees
 static int x=90;//this will be shadowed at line 7
    public static void main(String[] args){
   System.out.println(x);
   int x; //the class var at line  3 is shadowed by this
    //System.out.println(x); // will give error //scope will begin when the value is initialized
   c=45;
   System.out.println(x);
   fun();
    }
    static void fun(){
        
      System.out.println(x);
    }
}
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //print the entered number until 0 is entered
          int num;
       do{
      
        System.out.println("Enter a number:");
         Scanner sc =new Scanner(System.in);
         num=sc.nextInt();
         System.out.println("---------------");
          System.out.println(num);
        }
        while(num!=0);
    }
}

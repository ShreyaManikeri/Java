import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        //print fibonacci numbers til num
        int num;
         System.out.print("Enter an number:");
        Scanner sc =new Scanner(System.in);
         num=sc.nextInt();
         int a=0;
         int b=1;
         int c=0;
       for(int i=1;i<=num;i++)
         {
            System.out.println(c);
            a=b;
           b=c;
           c=a+b;
         }
         
    }
}

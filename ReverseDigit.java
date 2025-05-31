package Numbers;
import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        //program to reverse digits of number
        int num;
        int rem;
        int rev=0;
         System.out.print("Enter an number:");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.print("Reverse Digit :");

        do{
             rem=num%10;
             rev=rev*10+rem;
             num/=10;
        }while(num!=0);
       
System.out.println(rev);

    }
}

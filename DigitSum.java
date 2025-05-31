package Numbers;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        //the sum of digits of a given number
        int num;
        int rem=0;
        int digitsum=0;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        do{
            rem=num%10;
            digitsum+=rem;
            num/=10;

        }while(num>0);
        System.out.print("The sum of digits of number is:"+ digitsum);
    }
    
}

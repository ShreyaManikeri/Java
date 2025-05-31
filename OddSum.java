package Numbers;
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        //sum of odd number between 1 and n
        int n;
        int sum=0;
        int sum1=0;
         System.out.print("Enter value of n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
            else
            sum1+=i;

        }
         System.out.print("The sum of odd numbers is:"+sum);
          System.out.print("\nThe sum of even numbers is:"+sum1);
    }
}

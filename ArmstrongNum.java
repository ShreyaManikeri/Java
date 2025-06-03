import java.util.Scanner;

public class ArmstrongNum {
     public static void main(String[] args) {
        //also known as "Narcissistic Number"
        //check if given number is Armstrong number
        //Stron num:  the sum of power of a digits raised to number of digits is equal to given number e.g 153,370,371,407 etc
         int num;
         int rem=0;
         int power=1;
         int sum=0;
         System.out.print("Enter an number:");
        Scanner sc =new Scanner(System.in);
         num=sc.nextInt();
         int temp=num;

         do{
            rem=num%10;//3,5,1
            for(int i=1;i<=digitnum(temp);i++)
            {
              power*=rem;
            // System.out.println(power);
            // System.out.println(digitnum(temp));
            }
              sum+=power;
            num/=10;
            power=1;
         }while(num>0);

         if(sum==temp)
         System.out.println(temp+" is a ArmStrong number");
         else
         System.out.println(temp+" is not a ArmStrong number");
    }

    // count the number of digits in a number
    static int digitnum(int num)
    {
        int rem1=0;
        int count=0;
        while(num>0){
        rem1=num%10;
        count++;
        num/=10;
        }
        return count;
    }
   
    
}
 
    

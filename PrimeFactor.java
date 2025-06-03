import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        //find the Prime Factors of a number
        System.out.print("Enter an number: ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i*i<=num;i++)//2,3
        {
            while (num%i==0) {//6/2=3
                System.out.println(i+"mm");//2
                num=num/i;//3
                // System.out.println(num);
                
            }
        }
        if(num>1)
      
         System.out.println(num+"nn");
    }
}

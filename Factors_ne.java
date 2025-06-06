import java.util.Scanner;

public class Factors_ne {
     public static void main(String[] args) {
        //find factors of negative integer
     System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
       System.out.println("The factors are:");
        for(int i=num;i<=Math.abs(num);++i)
        {
            if(i==0)
              continue;
            else
            {
                if(num%i==0)
                   System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class Factors_po {
    //calculate factors of positive integer
    public static void main(String[] args) {
        
     System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
       System.out.println("The factors are:");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            System.out.println(i);
        }
    }
}

import java.util.Scanner;
public class Reapeted{
    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
    int i=0;
        while(num!=0){
            int  rem=num%10;
            
            if(rem==3)
            {
                     i++;
            }
       
            num=num/10;
        }
        System.out.println(i);

    }
}
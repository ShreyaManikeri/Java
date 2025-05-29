import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        //print the table for entered number
        int n;
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i =1;i<=10;i++)
        System.out.println(n*i);
    }
}

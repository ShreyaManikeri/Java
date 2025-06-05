import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        //print fibonacci numbers til num using array
        int n;
         System.out.print("Enter an number:");
        Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
         int arr[]=new int[n];
          arr[0]=0;
          arr[1]=1;
         for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
         }
         System.out.println("The Fibonacci series is:");
          for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }
         

        
         
    }
}

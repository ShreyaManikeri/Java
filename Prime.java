import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is prime number.");
        }else{
            System.out.println(num+" is not a prime number");
        }
        
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i< n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

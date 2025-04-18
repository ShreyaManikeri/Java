import java.util.Scanner;

public class EvenOdd {
    
     public static void main(String[] args) {
        
        System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println(num+" is even number.");
        }else{
            System.out.println(num+" is  odd number");
        }
        
        
    }
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        
        return false;
    }
}

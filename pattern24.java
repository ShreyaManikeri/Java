import java.util.Scanner;

public class pattern23 {
    
public static void main(String[] args) {
    int n;
System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
          System.out.println("---------------------");
    //can do this using one variable n

int count=1;
for(int i=1;i<=n;i++){
   for(int j=(n-i);j>=1;j--){
  System.out.print(" ");;}
for(int j=1;j<=n;j++){
   System.out.print("*");
}
    System.out.println(" ");;// or use "\n"

}
 
}
}

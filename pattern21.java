import java.util.Scanner;

public class pattern21 {
   

public static void main(String[] args) {
    int n;
     System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
          System.out.println("---------------------");
int count=1;
for(int i=n;i>=1;i--){
   for(int j=1;j<=i;j++){
  System.out.print(j);//it is for column & is very imp 
}
    System.out.println(" ");// or use "\n"
}
}
}
    


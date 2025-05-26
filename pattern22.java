import java.util.Scanner;

public class pattern22 {
public static void main(String[] args) {
    int n;
System.out.println("Enter an number");
        Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
          System.out.println("---------------------");
    //can do this using one variable n
int count=1;
for(int i=1;i<=n;i++){
   for(int j=1;j<=i;j++)
   {
     if((i+j)%2==0){
      System.out.print("1");}
     else
       System.out.print("o");
//it is for column & is very imp 
}
    System.out.println(" ");;// or use "\n"

}
 
}


}

    
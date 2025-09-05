import java.util.Scanner;

public class Pattern{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    pattern12(n);

}
private static void pattern12(int n) {
  for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=i; j++)
     {
       System.out.print(j);
    }
    for (int j = 1; j <= 2*n-2*i; j++) {
        System.out.print(" ");
    }
     for (int j = i; j >=1; j--)
     {
       System.out.print(j);
    }
 System.out.println();
}
}
private static void pattern11(int n) {
 for (int i = 0; i <n; i++) {
    for (int j = 0; j <i; j++)
     {
        if(i%2==0 || j%2==0)
        System.out.print("1");
        else
        {
            System.out.print("0");
        }
    }
 System.out.println();
}
   
}

private static void pattern10(int n) {
 for (int i = 1; i <= 2*n-1; i++) {
    for (int j = 1; j <=i; j++)
     {
        System.out.print("*");
    }
if(i>n){
    for (int j = 1; j <=(2*n)-i;j++)
     {
        System.out.print("*");
    }
}
    System.out.println();
}
}
//inverted tringle
private static void pattern7(int n) {
   for (int i = 0; i < n; i++) {

    for (int j = 1; j <=i; j++)
     {
        System.out.print(" ");
    }
     for (int j = 1; j <=2*n-(2*i+1); j++)
     {
        System.out.print("*");
    }
     for (int j = 1; j <=i; j++)
     {
        System.out.print(" ");
    }
    
    System.out.println();
}
}
//tringle
private static void pattern6(int n) {
 for (int i = 0; i < n; i++) {

    for (int j = 1; j <=n-i+1; j++)
     {
        System.out.print(" ");
    }
     for (int j = 1; j <=2*i+1; j++)
     {
        System.out.print("*");
    }
     for (int j = 1; j <=n-i+1; j++)
     {
        System.out.print(" ");
    }
    
    System.out.println();
}
}
//inverted right angle tringle
private static void pattern5(int n) {
   for (int i = 1; i <= n; i++) {
    for (int j = 1; j <=n-i+1; j++)
     {
        System.out.print(j);
    }
    System.out.println();
}
}
private static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
    for (int j = 1; j <=i; j++)
     {
        System.out.print(i);
    }
    System.out.println();
}
}
//right angle tringle
private static void pattern3(int n) {
   for (int i = 1; i <= n; i++) {
    for (int j = 1; j <=i; j++)
     {
        System.out.print(j);
    }
    System.out.println();
}
}
//right angle tringle
private static void pattern2(int n) {
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <=i; j++)
     {
        System.out.print("*");
    }
    System.out.println();
}
}
//rectangle
public static void  pattern1(int n){
for (int i = 0; i < n; i++) {
    for (int j = 0; j <n; j++) 
    {
            System.out.print("*");
     }
    System.out.println();
}


}
}
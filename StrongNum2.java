import java.util.Scanner;

public class StrongNum2 {
    public static void main(String args[])
    {
        //from website
        Scanner input = new Scanner(System.in);		
        System.out.print("Enter The Number : ");
        int n = input.nextInt();
		int i,fact_n,rem,total = 0,temp = n;
		while(n != 0)
		{
			i = 1;
			fact_n = 1;
			rem = n % 10;//5,4,1
			while(i <= rem)
			{
				fact_n = fact_n * i;//120,
				i++;
			}
			total = total + fact_n;//120
			n = n / 10;//14
		}
		if(total == temp)
			System.out.println(temp + " is a Strong Number");
		else
			System.out.println(temp + " is not a Strong Number");
     }
}


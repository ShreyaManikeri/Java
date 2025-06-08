import java.util.Scanner;

public class lcm {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		int rem = 0,lcm = 0, x = 0, y = 0;
 
		System.out.printf("Enter the Number 1 : ");
		num1 = input.nextInt();
		System.out.printf("Enter the Number 2 : ");
		num2 = input.nextInt();
 
		if (num1 > num2)
		{
			x = num1;
			y = num2;
		}
		else
		{
			x = num2;
			y = num1;
		}
		rem = x % y;
		while (rem != 0)
		{
			x = y;
			y = rem;
			rem = x % y;
		}
		lcm = num1 * num2 / y;
		System.out.printf("Lowest Common Multiple is : "+lcm);
	}
}

import java.util.Scanner;

public class palindrom {
    public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Digits :");
		int num = input.nextInt();
		int rev = 0, rem, temp;
		temp = num;
		while (num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		};
 
		if (temp == rev)
			System.out.println (temp + " is Palindrome");
		else
			System.out.println (temp + " is not Palindrome");
	}
    
}

import java.util.Scanner;

public class bi_oc {
    public static void main(String args[])
	{
		int bin,i=1, j;
		int oct[] = new int[100];
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the Binary Number : ");
		bin = input.nextInt(); 
		while(bin != 0)
		{
			oct[i++] = bin%8;
			bin = bin/8;
		}
		System.out.print("Octal Number : ");
		for(j=i-1; j>0; j--)
		{
			System.out.print(oct[j]);
		}
	}
}

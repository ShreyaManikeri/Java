import java.util.Scanner;

public class bi_he {
    public static void main(String[] args) 
	{
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Binary Number : ");
		bin = input.nextInt();
		System.out.println("Binary Number : " + bin);
		while (bin > 0)
		{
			rem = bin % 2;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec != 0)
		{
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		System.out.print("HexaDecimal Number : ");
		for (j = i - 1; j >= 0; j--)
		{
			if (hex[j] > 9)
				System.out.print((char)(hex[j] + 55)+"\n");
			else
				System.out.print(hex[j]+"\n");
		}
	}
}

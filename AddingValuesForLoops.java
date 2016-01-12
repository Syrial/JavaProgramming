import java.util.Scanner;

public class AddingValuesForLoops
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Number: ");
		int num = kb.nextInt();
		int x = 0;
		
		System.out.println();
		
		for(int i = 1; i <= num; i++)
		{
				System.out.print(i + " ");
				x = x + i; 
		}
		
		System.out.print("\nThe sum is " + x + ".");
	}
}
import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count from: ");
		int CntFrm = keyboard.nextInt();

		System.out.print("Count by: ");
		int CntBy = keyboard.nextInt();

		System.out.print("Count to: ");
		int CntTo = keyboard.nextInt();

		for (int n = CntFrm; n <= CntTo; n = n + CntBy)
		{
			System.out.print(n + " ");
		}

		System.out.println();
	}
}

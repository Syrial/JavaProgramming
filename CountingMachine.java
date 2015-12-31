import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Count to: ");
		int counter = keyboard.nextInt();

		for (int n=1; n <= counter; n++){
			System.out.print(n + " ");
		}
		System.out.println();

	}
}

import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double TheSqrt= -1.0, YourNumber = 0;
		
		System.out.println("SQUARE ROOT!");
		
		while (TheSqrt < 0) {
			System.out.print("Enter a number: ");
			YourNumber = input.nextInt();
			if (YourNumber > 0) 
				TheSqrt = Math.sqrt(YourNumber);
			else
				System.out.println("You can't take the square root of a " +
									"negative number, silly.");	
		}
		
		System.out.print("The square root of " + YourNumber + " is " + TheSqrt + ".");
	}
}
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int TheAnswer = 1 + r.nextInt(99);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 - 100. Try to guess it.");
		System.out.print("> ");
		int MyGuess = input.nextInt();
		
		System.out.println();
		
		if(MyGuess < TheAnswer)
			System.out.println("Sorry, you are too low. I was thinking of " + TheAnswer + "." );
		else if(MyGuess > TheAnswer)
			System.out.println("Sorry, you are too high. I was thinking if " + TheAnswer + ".");
		else if(MyGuess == TheAnswer)
			System.out.println("You guessed it! What are the odds?!?");
		else 
			System.out.println("ERROR!!! ERROR!! ERROR!!");
		
	}
}
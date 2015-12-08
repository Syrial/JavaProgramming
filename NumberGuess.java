import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
	public static void main(String[] args){
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int random = 1 + r.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		int YourGuess = input.nextInt();
		
		System.out.println();
		
		if(YourGuess == random){
			System.out.println("That's right! My secret number was " + random + ".");
		}
		else{
			System.out.println("Sorry, but I was really thinking of " + random + ".");
		}
		
		
	}
}
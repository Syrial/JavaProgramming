import java.util.Scanner;

public class TwentyQuestions{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String Type, Size, myGuess = "initial";
		
		System.out.print("Two Questions!");
		System.out.println("\nThink of an object, and I'll try to guess it.");
		
		System.out.print("\nQuestion 1) Is it animal, vegetable, or mineral?" + "\n> ");
		Type = keyboard.next();
		
		System.out.print("\nQuestion 2) Is it bigger than a breadbox?" + "\n> ");
		Size = keyboard.next();
		
		
		if (Type.equals("animal") && Size.equals("yes")){
			myGuess = "moose";
		} else if (Type.equals("animal") && Size.equals("no")){
			myGuess = "squirrel";
		} else if (Type.equals("vegetable") && Size.equals("yes")){
			myGuess = "watermelon";
		} else if (Type.equals("vegetable") && Size.equals("no")){
			myGuess = "carrot";
		} else if (Type.equals("mineral") && Size.equals("yes")){
			myGuess = "Camaro";
		} else if (Type.equals("mineral") && Size.equals("no")){
			myGuess = "paper clip";
		} else {
			myGuess = "ERROR! ERROR!";
		} 
	
		System.out.println("You're thinking of a " + myGuess + "!");
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}
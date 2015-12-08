import java.util.Random;

public class Dice{
	public static void main(String[] args){
		
		Random r = new Random();
		int DiceRoll1 = 1 + r.nextInt(6), DiceRoll2 = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!" + "\n");
		
		System.out.println("Roll #1: " + DiceRoll1);
		System.out.println("Roll #2: " + DiceRoll2);
		int TotalRoll = DiceRoll1 + DiceRoll2;
		
		System.out.println("The total is " + TotalRoll + "!");
	}
}
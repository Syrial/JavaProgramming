import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int AceLoc = 1 + r.nextInt(3);
		
		Scanner input = new Scanner(System.in);
		int YourCard;
		
		String CardGraphicsDefault = ("\t\t## ## ##\n" +  
									  "\t\t## ## ##\n" +
									  "\t\t1  2  3\n");
									  
		String CardGraphics1 = ("\t\tAA ## ##\n" +  
								"\t\tAA ## ##\n" +
								"\t\t1  2  3\n");
									  
		String CardGraphics2 = ("\t\t## AA ##\n" +  
								"\t\t## AA ##\n" +
								"\t\t1  2  3\n");
								
		String CardGraphics3 = ("\t\t## ## AA\n" +  
							    "\t\t## ## AA\n" +
							    "\t\t1  2  3\n");
							 
		String CardChoice = "";
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash." + 
						"\nHe glances at you out of the corner of his eye and starts shuffling." +
						"\nHe lays down three cards.\n");
						
		System.out.println("Which one is the ace?\n");
		
		System.out.println(CardGraphicsDefault);
		
		System.out.print("> ");
		YourCard = input.nextInt();
		
		System.out.println();
		
		if(AceLoc == 1)
			CardChoice = CardGraphics1;
		else if(AceLoc == 2)
			CardChoice = CardGraphics2;
		else if(AceLoc == 3)
			CardChoice = CardGraphics3;
		else
			CardChoice = "Error!!! Error!! Error!";
		
		if (YourCard == AceLoc)
		{
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");
			System.out.println(CardChoice);
		} else
		{
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + AceLoc + ".\n");
			System.out.println(CardChoice);
		}
			
		
	}
}
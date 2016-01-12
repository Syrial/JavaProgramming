import java.util.Random;
import java.util.Scanner;

public class Blackjack
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to Eric's Blackjack Table!");
		
		int PC1 = r.nextInt(10) + 1;
		int PC2 = r.nextInt(10) + 1;
		
		System.out.println("\nYou draw a " + PC1 + " and a " + PC2 + ".");
		int PCT = PC1 + PC2;
		System.out.println("You have a total of " + PCT);
		
		int DC1 = r.nextInt(10) + 1;
		int DC2 = r.nextInt(10) + 1;
		
		System.out.println("\nDealer draws a " + DC1 + " and has a hidden card.");
		System.out.println("Dealer's total is also hidden.");
		
		String HitStay = "hit";
		
		do
		{
			System.out.print("\nWould you like to \"hit\" or \"stay\"? ");
			HitStay = kb.next();
			
			if(HitStay.equals("hit"))
			{	
				int PC3 = r.nextInt(10) + 1;
				PCT = PCT + PC3;
				System.out.println("\nYou drew a " + PC3 +".");
				System.out.println("Your total is " + PCT + ".");
			}	
			else if(HitStay.equals("stay"))
			{
				System.out.println("\nOkay, it is now the Dealer's turn.");
				System.out.println("Dealer's hidden card was " + DC2 + ".");
			}
			else
				System.out.println("Player doesn't know how to pick between hit or stay.");
			
			if(PCT > 21)
			{
				System.out.println("You have gone bust with a total of " + PCT + ".");
				System.out.println("\nDealer wins!");
				return;
			}
		}
		while(PCT <= 21 && HitStay.equals("hit"));
		
		int DCT = DC1 + DC2;
		while(DCT < 16)
		{			
			if(DCT < 16)
			{
				int DC3 = r.nextInt(10) + 1;
				System.out.println("\nDealer hits with a " + DC3 + ".");
				DCT = DCT + DC3;
				System.out.println("Dealer now has a total of " + DCT);
			}
			else
				System.out.println("Dealer will stay.");
			
			if(DCT > 21)
			{
				System.out.println("Dealer has gone bust with a total of " + DCT + ".");
				System.out.println("\nYou win!");
				return;
			}
		}
		
		System.out.println("\nYou have a total of " + PCT + ".");
		System.out.println("Dealer has a total of " + DCT + ".");
		
		if(PCT > DCT)
			System.out.println("\nYou win!");
		else if(DCT > PCT)
			System.out.println("\nDealer wins!");
		else if (DCT == PCT)
			System.out.println("\nIt's a tie. Dealer wins on ties!");
	}
}
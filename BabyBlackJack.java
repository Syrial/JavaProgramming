import java.util.Random;

public class BabyBlackJack
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int PlayerDraw1 = r.nextInt(10) + 1;
		int PlayerDraw2 = r.nextInt(10) + 1;
		
		int DealerDraw1 = r.nextInt(10) + 1;
		int DealerDraw2 = r.nextInt(10) + 1;
		
		System.out.println("Baby Blackjack!");
		
		System.out.println("\nYou drew " + PlayerDraw1 + " and " + PlayerDraw2 + ".");
		int PlayerTotal = PlayerDraw1 + PlayerDraw2;
		System.out.println("Your total is " + PlayerTotal + ".");
		
		System.out.println("\nThe dealer has " + DealerDraw1 + " and " + DealerDraw2 + ".");
		int DealerTotal = DealerDraw1 + DealerDraw2;
		System.out.println("Dealer's total is " + DealerTotal);
		
		if(PlayerTotal > DealerTotal)
			System.out.println("\nYOU WIN!");
		else if(PlayerTotal < DealerTotal)
			System.out.println("\nDEALER WINS!");
		else
			System.out.println("\nITS A DRAW!");
	}
}
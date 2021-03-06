import java.util.Scanner;

public class Nim2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Player 1, enter your name: ");
		String Player1 = input.next();
		
		System.out.print("Player 2, enter your name: ");
		String Player2 = input.next();
		
		System.out.println();
	
		int NimA = 5, NimB = 5, NimC = 5, NimNum, Nima, Nimb, Nimc, PrintItem;
		
		String PileChoice, CurrPlayer = Player1, OtherPlayer = Player2;
		
		String NimALine = " ", NimBLine = " ", NimCLine = " ";
		
		do {
			int LineCounter = 5;
			
			NimALine = " "; NimBLine = " "; NimCLine = " ";
			
			while (LineCounter != 0) {	
				
				if (LineCounter == NimA ) 
					NimALine = "*";
				if (LineCounter == NimB ) 
					NimBLine = "*";
				if (LineCounter == NimC ) 
					NimCLine = "*";			
				
				LineCounter --;
				
				System.out.println("\t" + NimALine + " " + NimBLine + " " + NimCLine);
			}
			
			System.out.println("\tA B C");
			
			System.out.print("\n" + CurrPlayer + ", choose a pile: ");
			PileChoice = input.next();
			
			while ((PileChoice.equals("A") && NimA == 0) || (PileChoice.equals("B") && NimB == 0) ||
			       (PileChoice.equals("C") && NimC == 0))
			{
				System.out.print("Nice try, " + CurrPlayer + ". That pile is empty. Choose again: ");
				PileChoice = input.next();
			}
			
			System.out.print("How many to remove from pile " + PileChoice + ": ");
			NimNum = input.nextInt();
			
			System.out.println();
			
			while (NimNum <= 0) {
				System.out.print("\nYou must choose at least 1. How many? ");
				NimNum = input.nextInt();
			}
			
			if (PileChoice.equals("A")) {	
				while (NimNum > NimA) {
					System.out.print("\nPile " + PileChoice + " doesn't have that many. Try again: ");
					NimNum = input.nextInt();
					while (NimNum <= 0) {
						System.out.print("\nYou must choose at least 1. How many? ");
						NimNum = input.nextInt();
					}	
				}			
				NimA = NimA - NimNum;
			}
			else if (PileChoice.equals("B")) {
				while (NimNum > NimB) {
					System.out.print("\nPile " + PileChoice + " doesn't have that many. Try again: ");
					NimNum = input.nextInt();
					while (NimNum <= 0) {
						System.out.print("\nYou must choose at least 1. How many? ");
						NimNum = input.nextInt();
					}	
				}	
				NimB = NimB - NimNum;
			}
			else if (PileChoice.equals("C")) {
				while (NimNum > NimC) {
					System.out.print("\nPile " + PileChoice + " doesn't have that many. Try again: ");
					NimNum = input.nextInt();
					while (NimNum <= 0) {
						System.out.print("\nYou must choose at least 1. How many? ");
						NimNum = input.nextInt();
					}	
				}
				NimC = NimC - NimNum;
			}
			else
				System.out.println("Input error. Please re-enter");
			
			if (CurrPlayer.equals(Player1)){
				CurrPlayer = Player2;
			    OtherPlayer = Player1; 
			}	 
			else if (CurrPlayer.equals(Player2)){
				CurrPlayer = Player1;
				OtherPlayer = Player2;
			}
			else 
				System.out.println("This should never ever happen.");
			
			if ((NimA + NimB + NimC) == 1) {
				System.out.println(CurrPlayer + ", you must take the last remaining counter, so " +
				"you lost. " + OtherPlayer + " wins!");
				NimA = 0;
				NimB = 0;
				NimC = 0;
			}	
		} while (NimA > 0 || NimB > 0 || NimC > 0);
		
	}
}

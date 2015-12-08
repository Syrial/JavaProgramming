import java.util.Scanner;

public class BabyNim{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The Baby Nim Game");
		
		int NimA = 3, NimB = 3, NimC = 3, NimNum;
		
		String PileChoice;
		
		do {
			System.out.println("A: " + NimA + "\tB: " + NimB + "\tC: " + NimC);
			
			System.out.print("\nChoose a pile: ");
			PileChoice = input.next();
			
			System.out.print("How many to remove from pile " + PileChoice + ": ");
			NimNum = input.nextInt();
			
			if (PileChoice.equals("A")) 			
				NimA = NimA - NimNum;
			else if (PileChoice.equals("B"))
				NimB = NimB - NimNum;
			else if (PileChoice.equals("C"))
				NimC = NimC - NimNum;
			else
				System.out.println("Input error. Please re-enter");
			
		} while (NimA > 0 || NimB > 0 || NimC > 0);
		
		System.out.println("A: " + NimA + "\tB: " + NimB + "\tC: " + NimC);
		System.out.println("All piles are empty. Good job!");
		
	}
}
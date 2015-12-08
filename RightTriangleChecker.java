import java.util.Scanner;

public class RightTriangleChecker{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		
		int CurrSide, Side2 = 0, Side3 = 0, counter = 1;
		
		System.out.print("Side " + counter + ": ");
	    int FirstSide = input.nextInt();
		counter ++;
		
		do {
			System.out.print("Side " + counter + ": ");
			CurrSide = input.nextInt();
			if(CurrSide < FirstSide)
				System.out.println(CurrSide + " is smaller than " + FirstSide + ". Try again.");
			else {
				counter++;
			    Side2 = CurrSide;
				System.out.print("Side " + counter + ": ");
				CurrSide = input.nextInt();
				while (CurrSide < Side2){
					System.out.println(CurrSide + " is smaller than " + Side2 + ". Try again.");
					System.out.print("Side " + counter + ": ");
					CurrSide = input.nextInt();
					}
				counter++;
				Side3 = CurrSide;
				}
		} while (counter < 3);
			
		System.out.println("Your three sides are " + FirstSide + " " + Side2 + " " + Side3);
		
		if (FirstSide*FirstSide + Side2*Side2 == Side3*Side3)
			System.out.println("These side *do* make a right triangle. Yippy-skippy!");
		else
			System.out.println("NO! These sides do not make a right triangle!");
	}
}
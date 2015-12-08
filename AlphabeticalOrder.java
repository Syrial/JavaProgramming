import java.util.Scanner;

public class AlphabeticalOrder{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String YourName;
		
		int a,b,c,d;
		
		System.out.print("What's your last name? ");
		YourName = input.next();
		
		a = YourName.compareTo("Carswell");
		b = YourName.compareTo("Jones");
		c = YourName.compareTo("Smith");
		d = YourName.compareTo("Young");
		
		if (a < 0) {
			System.out.println("You don't have to wait long.");
		} else if (b < 0) {
			System.out.println("That's not bad.");
		} else if (c < 0) {
			System.out.println("Looks like a bit of a wait.");
		} else if (d < 0) {
			System.out.println("It's going to be a while.");
		} else {
			System.out.println("Not going anywhere for a while?");
		}
			
		
	}
}
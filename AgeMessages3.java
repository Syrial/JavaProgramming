import java.util.Scanner;

public class AgeMessages3{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int YourAge;
		String YourName;
		
		String Message1 = "You can't drive, ";
		String Message2 = "You can drive but not vote, ";
		String Message3 = "You can vote but not rent a car, ";
		String Message4 = "You can pretty much do anything, ";
		
		System.out.print("Your name: ");
		YourName = input.next();
		
		System.out.print("Your age: ");
		YourAge = input.nextInt();
		
		if(YourAge < 16) {
			System.out.println("\n" + Message1 + YourName + ".");
		}
		
		if(YourAge == 16|| YourAge == 17 ) {
			System.out.println("\n" + Message2 + YourName + ".");
		}
		
		if(YourAge >= 18 && YourAge <= 24 ) {
			System.out.println("\n" + Message3 + YourName + ".");
		}
		
		if(YourAge >= 25) {
			System.out.println("\n" + Message4 + YourName + ".");
		}
	}
}
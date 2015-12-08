public class MoreVarsAndPrint
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Eric Lee Lin Zheung";
		myAge = 29;			// absolutely the truth
		myHeight = 178; 	// centimeters
		myWeight = 80;		// kilograms
		myEyes = "Brown";
		myTeeth = "White";
		myHair = "Black";
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " centimeters tall.");
		System.out.println("He's " + myWeight + " kilograms heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the cofee.");
		
		// This line is tricky, try to get it exactly right.
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight
				+ " I get " + (myAge + myHeight + myWeight) + ".");
	}
}
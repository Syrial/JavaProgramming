import java.util.Scanner;

public class WorstGuessing{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int a,TheAnswer = 9;
		
		System.out.println("TEH WORSE NUMBER GESSING GAME EVAR !!!!1!");
		
		System.out.print("\nI\"M THKING OF A NMBR FROM 1-10. TRY 2 GESS!! ");
		a = input.nextInt();
		
		if(a == TheAnswer){
			System.out.print("\nLOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS " + TheAnswer);
		} else{
			System.out.print("\nWOOT! U SUX0R!!! I PWN J00!!! IT WAS " + TheAnswer);
		}
	}
}
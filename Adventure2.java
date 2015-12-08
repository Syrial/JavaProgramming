import java.util.Scanner;

public class Adventure2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ERIC'S TINY ADENTURE 2");
		
		int NextRoom = 1;
		String RoomChoice = "";
		
		while(NextRoom != 0){
			
			if (NextRoom == 1){
			
				System.out.println("\nYou are in a creepy house! Would you like to go \"upstairs\" or " +
				"into the \"kitchen\"?");
				System.out.print("> ");
				RoomChoice = input.nextLine();
			
				if (RoomChoice.equals("upstairs"))
					NextRoom = 2;
				else if (RoomChoice.equals("kitchen"))
					NextRoom = 3;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 2){
			
				System.out.println("\nUpstairs you see a hallway. At the end of the hallway is the master " +
				"\"bedroom\". There is also a \"bathroom\" off the hallway. Or, you can go back \"downstairs\"" +
				" . Where would you like to go?");
				System.out.print("> ");
				RoomChoice = input.nextLine();
				
				if (RoomChoice.equals("bedroom"))
					NextRoom = 4;
				else if (RoomChoice.equals("bathroom"))
					NextRoom = 5;
				else if (RoomChoice.equals("downstairs"))
					NextRoom = 1;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 3){
				
				System.out.println("\nThere is a long countertop with dirty dishes everywhere. " +
				"Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"" +
				" or go \"back\".");
				System.out.print("> ");
				RoomChoice = input.nextLine();
				
				if (RoomChoice.equals("refrigerator"))
					NextRoom = 6;
				else if (RoomChoice.equals("back"))
					NextRoom = 1;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 4){
				
				System.out.println("\nWhen you open the door there is a Queen sized bed with soft fluffy " +
				"pillows. You may \"lie down\" or \"leave\" the room.");
				System.out.print("> ");
				RoomChoice = input.nextLine();
				
				if (RoomChoice.equals("lie down"))
					NextRoom = 7;
				else if (RoomChoice.equals("leave"))
					NextRoom = 2;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 5){
				
				System.out.println("\nIn the bathroom there's a leaky tap. Brown water is dripping " +
				"from it. Do you \"take a sip\" or go \"back\".");
				System.out.print("> ");
				RoomChoice = input.nextLine();
				
				if (RoomChoice.equals("take a sip"))
					NextRoom = 8;
				else if (RoomChoice.equals("back"))
					NextRoom = 2;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 6){
				
				System.out.println("\nInside the refrigerator you see food and stuff. It looks " +
				"pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\").");
				System.out.print("> ");
				RoomChoice = input.nextLine();
				
				if (RoomChoice.equals("yes"))
					NextRoom = 9;
				else if (RoomChoice.equals("no"))
					NextRoom = 3;
				else
					System.out.println(RoomChoice + " is not one of the choices. Try again.");
			}
			
			if (NextRoom == 7){
				
				System.out.println("\nThe bed is soft and comfortable. After a few minutes you feel " +
				"yourself falling asleep. When you wake up, you find yourself engulfed by the bed" +
				"with your head sinking into the pillows. You slowly suffocate.");
				
				NextRoom = 0;
			}
			
			if (NextRoom == 8){
				
				System.out.println("\nAre you crazy? The water was brown! You get dyssentry and find " + 
				"the door locked behind you. The illness slowly eats away at you.");
				
				NextRoom = 0;
			}
			
			if (NextRoom == 9){
				
				System.out.println("\n+The food is slimy and foul, but you manage to choke it " +
				"down. Your stomach starts jumping like a frog in hot water. You feel faint. " +
				"Sliding to the floor, the darkness closes in.");
				
				NextRoom = 0;
			}
			
		}
		
		System.out.println("\nYou have died.");
	}
}
import java.util.Scanner;
public class Home_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Scissor: 0 Rock: 1 Paper: 2");
		System.out.print("Enter your choice: ");
		int input = sc.nextInt();
		int comp = (int) (Math.random() * 3);
		
		String u = null, ai = null;
		
		switch (input) {	
		case 0:
			u = "Scissor";break;
		case 1:
			u = "Rock";break;
		case 2:
			u = "Paper";
		}
		System.out.println("Your Input: " + u);
		
		switch (comp) {
		case 0:
			ai ="Scissor";break;
		case 1:
			ai = "Rock";break;
		case 2:
			ai = "Paper";
		}
		System.out.println("Computer Input: " + ai);
		
		if (input == comp) {
			System.out.println("Its a draw!");
		}
		else {
			if ((input == 0 && comp == 2) || (input == 1 && comp == 0) || (input == 2 && comp == 1)) System.out.println("You won");
			else System.out.println("You lose");
		}
		sc.close();
	}
}

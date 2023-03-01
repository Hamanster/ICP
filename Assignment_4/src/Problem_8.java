import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int ai = 1+(int)(Math.random()*(10));
			System.out.print("Users guess: ");
			int us = sc.nextInt();
			System.out.println("Coumputers guess: "+ai);
			if(us<ai) System.out.println("Too low, try again");
			else if(us>ai) System.out.println("Too High, try again");
			else {
				System.out.println("Good guess");
				break;
			}
		}
	}

}

import java.util.Scanner;
public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1 +((int) Math.random()*(9));
		System.out.println("Guess the number :");
		int g = sc.nextInt();
		if(a==g) System.out.println("Computer guesses:"+a+"\nYou got it right");
		else if(a==g-1 || a==g+1) System.out.println("Computer guesses:"+a+"\nAlmost got it");
		else System.out.println("Computer guesses:"+a+"\nYou got it wrong");
	}

}
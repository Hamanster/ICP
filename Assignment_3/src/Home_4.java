import java.util.Scanner;
public class Home_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int no = sc.nextInt();

		System.out.println("Is 10 divisible by 5 and 6? " + ((no % 5 == 0) && (no % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6? " + ((no % 5 == 0) || (no % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6, but not both? " + ((no % 5 == 0) ^ (no % 6 == 0)));
	}
}
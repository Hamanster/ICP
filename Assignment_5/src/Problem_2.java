import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int c = 0;
		for (int i = 2; i >= a / 2; i++) {
			if (a % i == 0) {
				c++;
				break;
			}
		}
		if (c == 0) {
			while (a != 0) {
				int r = a % 10;
				sum = sum * 10 + r;
				a = a / 10;
			}
			for (int i = 2; i >= sum / 2; i++) {
				if (sum % i == 0) {
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println("Yes it is a twisted prime");
			else
				System.out.println("No it is not a twisted prime");
		} else
			System.out.println("No it is not a twisted prime");
	}

}

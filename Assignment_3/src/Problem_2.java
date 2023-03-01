import java.util.Scanner;
public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter water consumed :");
		int x = sc.nextInt();
		if(x>=5000) System.out.println("You are eligible to cast your vote");
		else System.out.println("No, Alice is not following doctor’s advice");
	}

}

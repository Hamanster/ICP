import java.util.Scanner;
public class Problem_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		int base = sc.nextInt();
		System.out.println("Enter the power :");
		int power = sc.nextInt();
		int ans=1;
		for(int i = 0;i<power;i++) {
			ans = ans*base;
		}
		System.out.println(ans);
	}

}

import java.util.Scanner;
public class Home_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		String s = "";
		for(int i =1;i<=n;i++) {
			s = s+i+s;
			System.out.println(s);
		}

	}

}

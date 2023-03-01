import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int copy = n;
		int s = 0;
		while(n>0) {
			int r = n%10;
			s = s+r;
			n=n/10;
		}
		if(s%9==0) System.out.println("The number "+copy+" is divisible by 9.");
		else System.out.println("The number "+copy+" is not divisible by 9.");
	}

}

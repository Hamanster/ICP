import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int s =0;
		int c=0;
		while(n!=0) {
			int r = n%10;
			if(r!=0) {
				s = s+(int)(r*Math.pow(10, c));
				c++;
		}
			n=n/10;
	}
		System.out.println("new number is :"+s);

}
}
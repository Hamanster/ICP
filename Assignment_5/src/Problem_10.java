import java.util.Scanner;
public class Problem_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number bigger then 2 :");
		int n = sc.nextInt();
		int a =0;
		int b =1;
		int c =1;
		n-=3;
		System.out.print(a+","+b+","+c);
		while(n!=0) {
			int d=a+b+c;
			System.out.print(","+d);
			a=b;
			b=c;
			c=d;
			n--;
		}
	}
}

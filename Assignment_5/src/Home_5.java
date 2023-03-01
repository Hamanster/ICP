import java.util.Scanner;
public class Home_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int a =0;
		int b =1;
		int i=0;
		while(i<n/2) {
			System.out.print(a+","+b+",");
			a=a+b;
			b=a+b;
			i++;
		}
		if(n%2!=0) System.out.print(a);
	}
}

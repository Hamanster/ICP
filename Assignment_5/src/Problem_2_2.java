import java.util.Scanner;
public class Problem_2_2 {
	public static int prime(int x) {
		int c =0;
		for(int i=2;i>=x/2;i++)
			if(x%i==0) {
				c++;
				break;
			}
		return c;
	}
	public static void main(String[] args) {
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(prime(a)==0) {
			int r = a%10;
			sum=sum*10+r;
			a=a/10;
		}
		if(prime(sum)==0) System.out.println("Yes it is a twisted prime");
		else System.out.println("No it is not a twisted prime");
	}

}

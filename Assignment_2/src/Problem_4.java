import java.util.Scanner;
public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x =sc.nextInt();
		int sum=0;
		sum=sum+(x%10);
		x= x/10;
		sum=sum+(x%10);
		x=x/10;
		sum=sum+(x%10);
		System.out.println("The sum is:"+sum);
	}

}

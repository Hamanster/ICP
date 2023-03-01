import java.util.Scanner;
public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a =sc.nextInt();
		int b = sc.nextInt();
		int sum1=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) sum1=sum1+i;
		}
		int sum2 =0;
		for(int i=1;i<=b/2;i++) {
			if(b%i==0) sum2=sum2+i;
		}
		if(b==sum1 &&sum2==a) System.out.println("Yes its is an amicable no.");
		else System.out.println("Not an amicable number");
		
	}

}

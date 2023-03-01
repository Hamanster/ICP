import java.util.Scanner;
public class Home_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int sum=0;
		int product=1;
		for(int i =1;i<=n;i++) {
			if(i%2==0)sum+=i;
			else product*=i;
		}
		System.out.println("Sum of all even numbers : "+sum);
		System.out.println("Product of all odd numbers : "+product);
	}

}

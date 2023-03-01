import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int i = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n = sc.nextInt();
		System.out.println("Enter the 3rd number");
		int a = sc.nextInt();
		int sum=0;
		for(;i<=n;i+=a) {
			sum=sum+i;
			System.out.print(i+" ");
		}
		System.out.println("\nThe sum of numbers displayed is : "+sum);
	}

}

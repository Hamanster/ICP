import java.util.*;
public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int m=sc.nextInt();
		int n =sc.nextInt();
		int fac=1;
		for(;m<=n;m++) {
			fac=fac*m;
			System.out.println("Factorial of "+m+" is : "+fac);
		}

	}

}

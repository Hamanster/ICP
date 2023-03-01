import java.util.Scanner;
public class Home_5 {
	public static boolean cons(int a ,int b , int c) {
		if(a+1 ==b && b+1 ==c)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = sc.nextInt();
		System.out.println("Input the second number: ");
		int b = sc.nextInt();
		System.out.println("Input the third number: ");
		int c =sc.nextInt();
		System.out.println("Check whether the three said numbers are consecutive or not! ");
		System.out.println(cons(a,b,c));

	}

}

import java.util.Scanner;
public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the istance is km:");
		double km = sc.nextDouble();
		double m = km*1000;
		double feet = km*3280.8399;
		double inch = km*39370.0787;
		long cm =(int)km*100000;
		System.out.println(km+" km is "+m+" meter");
		System.out.println(km+" km is "+feet+" feet");
		System.out.println(km+" km is "+inch+" inch");
		System.out.println(km+" km is "+cm+" cm");
	}

}

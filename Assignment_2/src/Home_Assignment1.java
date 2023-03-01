import java.util.Scanner;
public class Home_Assignment1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Minutes:");
        int minutes =sc.nextInt();
        int days = minutes/(60*24);
		int years = days/365;
		days = days-(years*365);
		System.out.printf("%d minutes is approximetly %d years %d days",minutes,years,days);
	}

}

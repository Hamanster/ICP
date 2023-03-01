import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		double da = 0.4*salary;
		double hra = 0.2*salary;
		double gross_salary = salary +da+hra;
		System.out.println("Gross salary:"+gross_salary+"\nDA:"+da+"\nhra:"+hra);
	}

}

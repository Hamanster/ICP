import java.util.Scanner;
public class Home_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of sin(x)");
		double x =sc.nextDouble();
		int sign=-1;
		int i =1;
		double term=x;
		double sum=x;
		while(term>0.000001) {
			i+=2;
			term = term*((x*x)/(i*(i-1)));
			sum=sum+(term*sign);
			sign*=-1;
		}
		System.out.println(sum);
	}

}

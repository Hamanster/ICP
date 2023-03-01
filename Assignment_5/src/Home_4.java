import java.util.Scanner;
public class Home_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of cos(x)");
		double x = sc.nextDouble();
		double sum=1;
		double term=1;
		int i = 0 ;
		int sign=-1;
		while(term>0.000001) {
			i+=2;
			term=term*((x*x)/(i*(i-1)));
			sum=sum+(sign*term);
			sign*=-1;
		}
		System.out.println(sum);
	}

}

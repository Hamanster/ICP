import java.util.Scanner;
public class Problem_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = sc.nextDouble();
		double sah=3*Math.PI*Math.pow(r, 2);
		double volume = (2.0/3)*Math.PI*Math.pow(r, 3);
		System.out.println("The surface area of the Hemisphere is: "+sah);
		System.out.println("The volume of the Hemisphere is: "+volume);
	}

}

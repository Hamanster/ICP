import java.util.Scanner;
public class Problem_5 {
	public static double area(int n, double side) {
	    double numerator = n * side * side;
	    double denominator = 4 * Math.tan(Math.PI / n);
	    return numerator / denominator;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side: ");
	int n = sc.nextInt();
	double side = 5.0;
	double area = area(n, side);
	System.out.println("Area of the regular polygon: " + area);
	}
}
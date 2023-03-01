import java.util.Scanner;
public class Home_Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 sides of the triangle ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		double a =((x2-x1)/(y2-y1));
		double b =((x3-x2)/(y3-y2));
		double c =((x1-x3)/(y1-y3));
		double s = (a+b+c)/2;
		System.out.println(a);
		double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is:"+area);
//		1.5
//		-3.4
//		4.6
//		5
//		9.5
//		-3.4
	}

}

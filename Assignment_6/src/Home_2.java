import java.util.Scanner;
public class Home_2 {
	public static double volume(double side) {
		return side*side*side;
	}
	public static double volume(float r) {
		return (4.0/3.0)*Math.PI*Math.pow(r,3);
	}
	public static double volume(double l , double b , double h  ) {
		return l*b*h;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the side of a cube :" );
		double c =sc.nextDouble();
		System.out.println("Enter the radius :");
		float r=sc.nextFloat();
		System.out.println("Enter  Length, Breadth , Height :");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h =sc.nextDouble();
		System.out.println("The volume of the cude is : "+volume(c));
		System.out.println("The volume of the sphere is : "+volume(r));
		System.out.println("The volume of the cuboid is : "+volume(l,b,h));
	}

}

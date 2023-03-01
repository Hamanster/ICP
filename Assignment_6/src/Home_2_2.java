import java.util.Scanner;
public class Home_2_2 {
	public static void volume(double side) {
		System.out.println("The volume of the cude is : "+side*side*side);
	}
	public static void volume(float r) {
		System.out.println("The volume of the sphere is : "+(4.0/3.0)*Math.PI*Math.pow(r,3));
	}
	public static void volume(double l , double b , double h  ) {
		System.out.println("The volume of the cuboid is : "+ l*b*h);
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
		volume(c);
		volume(r);
		volume(l,b,h);
	}

}

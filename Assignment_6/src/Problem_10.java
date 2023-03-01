import java.util.Scanner;
public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                System.out.println("Enter the base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Area of triangle: " + ar(base, height));

                System.out.println("Enter the side length of the square:");
                double side = sc.nextDouble();
                System.out.println("Area of square: " + ar(side));

                System.out.println("Enter the radius of the circle:");
                float radius = sc.nextFloat();
                System.out.println("Area of circle: " + ar(radius));

                System.out.println("Enter the length and width of the rectangle:");
                float length = sc.nextFloat();
                float width = sc.nextFloat();
                System.out.println("Area of rectangle: " + ar(length, width));

        }
    
    public static double ar(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double ar(double side) {
        return side * side;
    }
    
    public static double ar(float radius) {
        return Math.PI * radius * radius;
    }
    
    public static double ar(float length, float width) {
        return length * width;
    }
}
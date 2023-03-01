import java.util.Scanner;
public class Problem_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two coordinates :");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if(x>0 && y>0) System.out.println(" is in quadrant I");
		else if(x<0 && y>0) System.out.printf("is in quadrant II ");
		else if(x<0 && y<0) System.out.printf("is in quadrant III ");
		else if(x>0 && y<0) System.out.printf("is in quadrant IV ");
		else if(x==0) System.out.printf("is on the y-axis");
		else if(y==0) System.out.printf("is on the x-axis ");
	}
	

}

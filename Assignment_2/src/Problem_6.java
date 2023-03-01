import java.util.Scanner;
public class Problem_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of seconds");
		float t = sc.nextFloat();
		float g=32.174f;
		float d=(float)(0.5*g*Math.pow(t, 2));
		System.out.println("Distance travelled :"+d);
		
	}

}

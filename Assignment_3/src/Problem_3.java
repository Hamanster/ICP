import java.util.Scanner;
public class Problem_3 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z =sc.nextInt();
		if(x>y && x>z && y>z) System.out.println("Increasing");
		else if(z>y && z>y && y>x) System.out.println("Decreasing");
		else System.out.println("Neither Increasing nor decreasing");

	}

}
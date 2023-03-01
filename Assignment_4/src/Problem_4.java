import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r=0;
		do {
			r=x%y;
			x=y;
			y=r;
		}while(r>0);
		System.out.println(x);
	}

}

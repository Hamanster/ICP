import java.util.Scanner;
public class Problem_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the mark");
		int m = sc.nextInt();
		int n=m/10;
		switch(n)
		{
		case 4:
			System.out.println("Grade E");
			break;
		case 5:
			System.out.println("Grade D");
			break;
		case 6:
			System.out.println("Grade C");
			break;
		case 7:
			System.out.println("Grade B");
			break;
		case 8:
			System.out.println("Grade A");
			break;
		case 9:
			System.out.println("Grade O");
			break;
		case 10:
			System.out.println("Grade O");
			break;
		default: System.out.println("Grade F");
		}
		
	}

}

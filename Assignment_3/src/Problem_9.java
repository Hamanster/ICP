import java.util.Scanner;
public class Problem_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		int x = Math.max(a, Math.max(c, b));
//		int y = Math.min(a,Math.min(c, b));
//		System.out.println("Largest no. "+x);
//		System.out.println("2nd largest no. "+(a+b+c-(x+y)));
		if(a>b && a>c) {
			System.out.println("1st largest :"+a);
			if(b>c)System.out.println("2nd largest :"+b);			
			else System.out.println("2nd largest :"+c);
		}
		else if(b>a && b>c) {
			System.out.println("1st largest :"+b);
			if(a>c)System.out.println("2nd largest :"+a);			
			else System.out.println("2nd largest :"+c);
		}
		else if(c>a && c>b) {
			System.out.println("1st largest :"+c);
			if(a>b)System.out.println("2nd largest :"+a);			
			else System.out.println("2nd largest :"+b);
		}
	
	}

}

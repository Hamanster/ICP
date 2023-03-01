import java.util.Scanner;
public class Problem_1 {
	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		if(x!=0)
			return y/x;
		else 
			return 0;
	}
	public static int remainderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		if(n>0)
			return Math.sqrt(n);
		else 
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n 1 for + \n 2 for - \n 3 for * \n 4 for / \n 5 for % \n 6 for sqrt");
		int n = sc.nextInt();
		switch (n){
		case 1: 
			System.out.println("Enter 2 numbers :");
			int x =sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x+" + "+y+" = "+additionSimple(x,y));
			break;
		case 2:
			System.out.println("Enter 2 numbers :");
			int a =sc.nextInt();
			int b = sc.nextInt();
			System.out.println(b+" - "+a+" = "+subtractionSimple(a,b));
			break;
		case 3:
			System.out.println("Enter 2 numbers :");
			int c =sc.nextInt();
			int d = sc.nextInt();
			System.out.println(c+" * "+d+" = "+multiplicationSimple(c,d));
			break;
		case 4:
			System.out.println("Enter 2 numbers :");
			int e =sc.nextInt();
			int f = sc.nextInt();
			System.out.println(f+" / "+e+" = "+divisionSimple(e,f));
			break;
		case 5:
			System.out.println("Enter 2 numbers :");
			int g =sc.nextInt();
			int h = sc.nextInt();
			System.out.println(g+" % "+h+" = "+additionSimple(g,h));
			break;
		case 6:
			System.out.println("Enter 2 numbers :");
			int i =sc.nextInt();
			System.out.println("Squareroot of "+i+" = "+squareRootSimple(i));
			break;
		}
	}

}
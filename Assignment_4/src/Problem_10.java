import java.util.Scanner;
public class Problem_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number :");
		int n = sc.nextInt();
		int p=1;
		for(int i =1;;i++) {
			p=(int)(Math.pow(3, i));
			if(p>n) {
				System.out.println("The largest power of 3 less than or equal to "+n+" is "+ (int)Math.pow(3,i-1));
				break;
			}
			else if(p==n) {
				System.out.println("The largest power of 3 less than or equal to "+n+" is "+p);
				break;
			}
			
		}

	}

}

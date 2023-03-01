import java.util.Scanner;
public class Problem_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of units consumed :");
		int n = sc.nextInt();
		if(n<=50) System.out.println("Amount payable :"+(n*3));
		else if(n>50 &&n<=200) System.out.println("Amount payable :"+(50 *3 +(n-50)*4.80));
		else if(n>200 &&n<=400) System.out.println("Amount payable :"+(50 *3 +150*4.80+(n-200)*5.80));
		else if(n>=400) System.out.println("Amount payable :"+((50 *3) + (150*4.80) + (200*5.80)+(n-400)*6.20 ));
		
		}

}
import java.util.Scanner;
public class Problem_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of units consumed :");
		int n = sc.nextInt();
		double amount =0;
		double discount =0;
		System.out.println("Do you want to pay online(y/n): ");
		char c = sc.next().charAt(0);
		if(n<=50) {
			amount = n*3;
			System.out.println("Total Amount :"+ amount);
		}
		else if(n>50 &&n<=200) {
			amount =(50 *3) +((n-50)*4.80);
			System.out.println("Total Amount :"+ amount);
		}
		else if(n>200 &&n<=400) {
			amount=(50 *3) +(150*4.80)+((n-200)*5.80);
			System.out.println("Total Amount :"+ amount);
		}
		else if(n>=400) {
			amount=(50 *3) + (150*4.80) + (200*5.80)+((n-400)*6.20 );
			System.out.println("Total Amount :"+ amount);
		}
		if(c =='y') {
			discount = amount*(3.0/100);
			System.out.println("Discount :"+discount);
			System.out.println("Amount payable :"+(amount-discount));
		}
		
		else System.out.println("Amount payable :"+(amount-discount));

		}

}

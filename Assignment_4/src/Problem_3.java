import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of n");
		int n = sc.nextInt();
		int copy=n;
		int sum=0;
		do {
			int a = 1 +(int) (Math.random()*(copy));
			sum=sum+a;
			System.out.println(a+" ");
			n--;
		}while(n>0);
		System.out.println("The average of "+copy+" random numbers are :"+(sum/copy));
	}

}

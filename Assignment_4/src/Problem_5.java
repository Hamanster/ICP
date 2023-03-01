import java.util.Scanner;
public class Problem_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int sum=0;
		for(int i =1;i<=(x/2);i++) {
			if(x%i==0)sum=sum+i;
		}
		if(sum==x) System.out.println(x+" is a perfect number.");
		else System.out.println(x+" is not a perfect number.");
	}

}

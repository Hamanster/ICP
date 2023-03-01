import java.util.Scanner;
public class Problem_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int sum=0;
		int temp=0;
		for(int i =1;i<=n;i++) {
			temp=temp+i;
			sum=sum+temp;
		}
		System.out.println(sum);
	}

}

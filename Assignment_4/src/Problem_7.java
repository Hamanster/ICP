import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of n");
		int n = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(n+" x "+i+" = " +(n*i));
		}
	}

}

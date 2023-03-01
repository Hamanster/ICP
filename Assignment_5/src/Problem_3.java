import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr 2 numbers :");
		int i = sc.nextInt();
		int a = sc.nextInt();
		for(;i<=a;i++) {
			int c=0;
			for(int j = 2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
					c++;
					break;
				}
				
			}
			if(c==0) System.out.println(i+" ");
		}
	}

}

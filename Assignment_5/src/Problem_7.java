
public class Problem_7 {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			int ch = 65;
			for(int j = 1;j<=i;j++) {
				
				System.out.print((char)(ch)+" ");
				ch++;
			}
			System.out.println();
		}
		System.out.println();
		for(int i =5;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =1;i<=5;i++) {
			for(int j = 5;j>=1;j--) {
				if(j<=i) System.out.print(i+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}

}


public class Home_1 {

	public static void main(String[] args) {
		int c =1;
		for(int i =1;i<=5;i++) {
			for(int j =5;j>=1;j--) {
				if(j==c) {
					c++;
					System.out.print("*");
				}
				else System.out.print(j);
			}
			System.out.println();
		}

	}

}

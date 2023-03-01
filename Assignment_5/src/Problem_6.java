
public class Problem_6 {

	public static void main(String[] args) {
		//6 bit A
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//END
		System.out.println();
		//6 bit 2
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//END
		System.out.println();
		//6 BIT 3
		int c=0;
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(++c+" ");
			}
			System.out.println();
		}
		//END
		System.out.println();
		//6 BIT 4
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			//END
			System.out.println();
		}
	}

}

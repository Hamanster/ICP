
public class Problem_7 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		System.out.printf("Before \nx: %d \ny : %d \n",x,y);
		int z = x;
		x=y;
		y=z;
		System.out.printf("After \nx: %d \ny : %d",x,y);


	}

}

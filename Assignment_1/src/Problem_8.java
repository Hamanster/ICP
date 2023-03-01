
public class Problem_8 {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		int z =6;
		int a =8;
		System.out.printf("Before \nx: %d \ny: %d \nz: %d \na: %d \n",x,y,z,a);
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		System.out.printf("After \nx: %d \ny : %d",x,y);
		x=x+y+z+a;
		y=x-y-z-a;
		z=x-y-z-a;
		a=x-y-z-a;
		x=x-y-z-a;
		System.out.printf("After \nx: %d \ny: %d \nz: %d \na: %d",x,y,z,a);
		

	}

}

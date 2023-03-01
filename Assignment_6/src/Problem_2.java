import java.util.Scanner;
public class Problem_2 {
	public static int PentaNum(int n) {
	    return n * (3 * n - 1) / 2;
	}
	public static void main(String[] args) {
        for(int i = 1;i<=100;i++){
            System.out.print(PentaNum(i));
            if(i%10==0)
                System.out.println();
            else
                System.out.print(" , ");
        }

    }
	
}

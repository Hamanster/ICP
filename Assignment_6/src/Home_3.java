import java.util.Scanner;

public class Home_3 {
	public static int e_o(int a) {
		
		if(a/2==0)
			return 1;
		else 
			return 0;
	}
	public static void mid_char(String s) {
		System.out.println("The middle character in the string : "+s.charAt((s.length()/2)+e_o(s.length())));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s  =sc.nextLine();
		mid_char(s);
		}

}

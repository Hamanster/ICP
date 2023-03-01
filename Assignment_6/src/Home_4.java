import java.util.Scanner;
public class Home_4 {
	public static int count(String s) {
		s=s.trim()+" ";
		int c =0;
		for (int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		System.out.println("The middle character in the string : "+count(s));

	}

}

import java.util.Scanner;
public class Problem_8 {
	public static boolean pali(String input) {
		String p="";
		input = input.toLowerCase();
		for(int i =input.length()-1;i>=0;i--) {
			p = p + input.charAt(i);
		}
//		return p.equals(input); we can use .equals() which is a String function,
//		but it is not taught tu us, so I will use a different method.
		boolean flag = true;
		for(int i = 0;i<p.length();i++){
			if(p.charAt(i)!=input.charAt(i)){
				flag =false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = sc.nextLine();
	System.out.println("Is input a palindrome? : " + pali(str));
}
}
import java.util.Scanner;
public class Problem_8 {
	public static boolean pali(String input) {
	    String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	    return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
	}
	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.print("Enter a string: ");
    String str = x.nextLine();
	boolean Pali = pali(str);
	System.out.println("Is input a palindrome? : " + Pali);
}
}
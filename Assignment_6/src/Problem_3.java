import java.util.Scanner;
public class Problem_3 {
	public static int reverse(int number) {
	    int r = 0;
	    while (number != 0) {
	        r = (r * 10) + (number % 10);
	        number /= 10;
	    }
	    return r;
	}
	public static boolean isPalindrome(int number) {
	    return number == reverse(number);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int no = sc.nextInt();
        System.out.println("Reverse No: " + reverse(no));
        if (isPalindrome(no)) {
            System.out.println(no + " is a palindrome.");
        } else {
            System.out.println(no + " is not a palindrome.");
        }
    }
}
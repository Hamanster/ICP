import java.util.Scanner;
public class Problem_7 {
public static int count(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.print("Enter a string: ");
    String str = x.nextLine();
    int vowelCount = count(str);
    System.out.println("The number of vowels in \"" + str + "\" is " + vowelCount);
}
}
import java.util.Scanner;
public class Problem_9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = x.nextLine();
        
        if (tPass(pass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean tPass(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        int DC = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                DC++;
            }
        }
        return DC >= 2;
    }
}
import java.util.Scanner;
public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = sc.nextLine();
        
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
        password=password.toLowerCase();
        for (int i =0;i<password.length();i++) {
            if ((int)password.charAt(i)>=47&&(int)password.charAt(i)<=57){
                DC++;
            }
            else if ((int)password.charAt(i)>=97 && (int)password.charAt(i)<=122) {
            }
            else
                return false;
        }
        return DC >= 2;
    }
}
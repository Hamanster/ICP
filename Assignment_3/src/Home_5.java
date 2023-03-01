import java.util.Scanner;
public class Home_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender, firstName, lastName, answer;
        int age;
        System.out.print("Hello! What gender are you?(m/f): ");
        gender = sc.next();
        System.out.print("What's your first name? ");
        firstName = sc.next();
        System.out.print("What's your last name? ");
        lastName = sc.next();
        System.out.print("How old are you? ");
        age = sc.nextInt();
        if (gender.equals("m") &&  age >= 20) System.out.println("Then I shall call you Mr. " + firstName);
        else System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
         if (gender.equals("f")&&(age >= 20)) {
        	 System.out.println("Are you married?(y/n) ");
        	 answer = sc.next();
        	 if (answer.equals("y")) System.out.println("Then I shall call you Mrs. " + firstName);
            else if (answer.equals("n")) System.out.println("Then I shall call you Ms. " + firstName);
            }
         else System.out.println("Then I shall call you " + firstName + " " + lastName);
        }
    }

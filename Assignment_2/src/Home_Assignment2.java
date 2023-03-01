import java.util.Scanner;

public class Home_Assignment2 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of eggs:");
    int egg =sc.nextInt();
    int gross_egg=egg/144;
    int dozen = (egg/12) -((gross_egg*144)/12);
    egg = egg-(gross_egg*144)-(dozen*12);
    System.out.printf("%d gross egg %d dozen %d left over",gross_egg,dozen,egg);
	}
}

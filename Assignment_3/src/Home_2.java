import java.util.Scanner;
public class Home_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter todays day: ");
		int input = sc.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int future = sc.nextInt();
		
		int futureDay = (input + future) % 7;
		
		String day = null, fday = null;
		
		switch (input) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		}
		if(futureDay == 0) {
			fday = "Sunday";
		}
		else if(futureDay == 1) {
			fday = "Monday";
		}
		else if(futureDay == 2) {
			fday = "Tuesday";
		}
		else if(futureDay == 3) {
			fday = "Wednesday";
		}
		else if(futureDay == 4) {
			fday = "Thursday";
		}
		else if(futureDay == 5) {
			fday = "Friday";
		}
		else if(futureDay == 6) {
			fday = "Saturday";
		}
		System.out.println("Todays is " + day + " and future day is " + fday);
	}
}

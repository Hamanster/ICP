import java.util.Scanner;
public class Home_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		int c=0;
		for(int i = 0;i<s.length();i++) {
			char ch =s.charAt(i);
			for(int j= i+1;j<s.length();j++) {
				if(ch==s.charAt(j))
					break;
				else 
					c=1;
			}
			if(c==1) {
				System.out.println(" The first non-repeated character is : "+ch);
				break;
			}
				
		}

	}

}

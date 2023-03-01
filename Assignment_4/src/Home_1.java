
public class Home_1 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i =1;i<=10;i++) {
			sum1 = sum1+(i*i);
			sum2 = sum2 +i;
		}
		System.out.println("the difference between the sum of the squares of the first "
				+ "ten natural numbers and the square of the sum is "
				+ ":\n "+(sum2*sum2)+" - "+sum1+" = "+((sum2*sum2)- sum1));

	}

}

public class AQ5_1 {

	public static void main(String[] args) {
        int W = 1;
        int G = 2;
        int K = 3;
        int A = 4;
        
        System.out.println("Before Swapping: "+ W +"  " + G +" "+ K +" "+A);
        W=W+G+K+A;
        A=W-G-K-A;
        K=W-G-K-A;
        G=W-G-K-A;
        W=W-G-K-A;
   
        System.out.println("After swapping: "+ W +"  " + G+" "+ K +" "+A);
	}

}

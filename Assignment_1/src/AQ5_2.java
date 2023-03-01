public class AQ5_2 {

	public static void main(String[] args) {		
		int W = 41;
		int A = 54;
		int K = 73;
		int G = 47;
		 
		System.out.println("Before swapping: "+ W +"  " + A +" "+ K +" "+G);
        
        //WA
        int Z = W;
        W = A;
        A = K;
        K = G;
        G = Z;
 
        System.out.println("After swapping: "+ W +"  " + A +" "+ K +" "+G);
	}

}

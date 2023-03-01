
public class Q_5 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int mini = (int)Math.min(x, (int)Math.min(y, z));
		int maximum = (int)Math.max(x, (int)Math.max(y, z));
		System.out.println(mini+" "+((x+y+z)-(mini+maximum))+" "+maximum);
	}

}

package CJ;

public class StaticKey {

	static int count = 0;
	
	StaticKey() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

}

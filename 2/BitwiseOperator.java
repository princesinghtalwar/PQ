
public class BitwiseOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = -7;
		int c = a|b;
		System.out.println("a|b: "+c);
		 c = a&b;
		System.out.println("a&b: "+c);
		c = a^b;
		System.out.println("a&b: "+c);
		c = ~a;
		System.out.println("a&b: "+c);
		
		if((a&1) != 0)
			System.out.println("ODD");
		else
			System.out.println("EVEN");
		
		if((a^b)<0)
			System.out.println("Different: "+(a^b));
		else
			System.out.println("Same: "+(a^b));
			
	}
}

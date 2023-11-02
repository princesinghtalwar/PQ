import java.util.ArrayList;
import java.util.List;

public class BinString {

	public static void main(String[] args) {
		BinString ob = new BinString();
		int n = 0b011;
		System.out.println(Integer.toBinaryString(n));
		System.out.println();
		System.out.println(1&0);
		System.out.println();
		List<Integer> list = new ArrayList<>();
		while(n>0) {
//			System.out.print(n&1);
			list.add(n&1);
			n>>=1;
		}
		for(int i = list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
		System.out.println();
		int num = 10000;
		for(int i = 0;i<num;i++) {
			if(ob.is2(i))
				System.out.print(i+" ");
		}
//		System.out.println(is2(i));
	}
	
	boolean is2(int n) {
		return (n!=0 &&(n&(n-1))==0);
	}

}

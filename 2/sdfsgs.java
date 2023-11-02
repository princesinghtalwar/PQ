
public class sdfsgs {

	public static void main(String[] args) {
		char[] t = {'a','b','c','a','c','r','t','a','f','g'};
		char[] p = {'c','r','t'};
		
		System.out.println(isPatFound(t,p));

	}
	public static boolean isPatFound(char[] t, char[] p) {
		int n = t.length;
		int m = p.length;
		
			for (int i = 0; i <=n-m; i++) {
				int j;
				for(j = 0;j<m;j++) {
					if(t[i+j]!=p[j]) {
						break;
					}
					if(j==m)
						return true;
				}
			}
		
		return false;
	}

}

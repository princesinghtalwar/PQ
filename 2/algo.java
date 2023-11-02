
public class algo {
	
	public int occurenceOfK(int k[],int n) {
		int count=0;
		
			for(int i=0;i<k.length;i++) {
					if(k[i]==n)
						count++;
			}		
		return count;		
	}

}

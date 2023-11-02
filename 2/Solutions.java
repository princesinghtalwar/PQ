public class Solutions {
   public static void main(String[] args) {
	   int A = 50;
	   for(int i =1;i<=A;i++) {
		   
		   if(i==A/2)
			   System.out.println();
			   System.out.print(solve(i)+" ");
	   }
   }
   
   public static int solve(int A) {
       int count = 0;
        int bit = 0;
       while((A&1)==0?true:false){
        	   count++;
        	   bit+=A&1;
        	   A >>= 1;
       }
       return count;
   }
}

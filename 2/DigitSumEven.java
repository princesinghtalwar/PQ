
public class DigitSumEven {

	public static void main(String[] args) {
		int input = 4;
		System.out.println(countEven(input));

	}
	
	public static int countEven(int num) {
        int count=0;
       for(int i = 2;i<=num;i++){
           if(isDigitSumEven(i))
               count++;
       }
       return count;
   }

   public static boolean isDigitSumEven(int i){
       int sum = 0;
       int temp = i;
       while(temp>0){
           sum+=temp%10;
           temp /=10;
       }
       return sum%2 == 0? true : false;
           
   }

}

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Calendar;

public class Test {
	public static void main(String args[]) throws ParseException, IOException {
		
	System.out.println("HELLO WORLD !!!");
//	Test obj = new Test();
//	try {
//		System.out.println(obj.checkNull());
//	} catch (IllegalAccessException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
//	char[] charPassword = new char[]{'P', 'R', 'I', 'N', 'C', 'E'};
//
//	System.out.print("Original char password value: ");
//	System.out.println(charPassword);
//	System.out.println(
//	  "Original char password hashCode: " 
//	  + Integer.toHexString(charPassword.hashCode()));
//
//	Arrays.fill(charPassword, '*');
//
//	System.out.print("Changed char password value: ");
//	System.out.println(charPassword);
//	System.out.println(
//	  "Changed char password hashCode: " 
//	  + Integer.toHexString(charPassword.hashCode()));
	
//	List<Integer> number = Arrays.asList(2,3,4,5);
//	  
//    // demonstration of map method
//    List<Integer> square = number.stream().map(x -> x*x).
//                           collect(Collectors.toList());
//    System.out.println(square);
//  
//    // create a list of String
//    List<String> names =
//                Arrays.asList("Reflection","Collection","Stream");
//  
//    // demonstration of filter method
//    List<String> result = names.stream().filter(s->s.startsWith("S")).
//                          collect(Collectors.toList());
////    System.out.println(result);
//  
//    // demonstration of sorted method
//    List<String> show =
//            names.stream().sorted().collect(Collectors.toList());
////    System.out.println(show);
//  
//    // create a list of integers
//    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
//  
//    // collect method returns a set
//    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
////    System.out.println(squareSet);
//  
//    // demonstration of forEach method
//    number.stream().map(x->x*x).forEach(y->System.out.println(y));
//  
//    // demonstration of reduce method
//    int even =
//       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
//    System.out.println(even);
	
	/*15db9742
	 String sDate1="20230110";  
	    Date date1=new SimpleDateFormat("yyyyMMdd").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);
	 	SimpleDateFormat sdf2 = new SimpleDateFormat("DDD");
	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	 	String julian=sdf2.format(date1);
	 	String da = sdf.format(new java.util.Date()).substring(2,4).toString().trim()+julian.toString().trim();
	 	String d = sdf.format(new java.util.Date());
	 	System.out.println(sdf.format(new java.util.Date()).substring(2,4).toString());
	 	
		System.out.println("Julian Date for "+sDate1+" is : "+julian+" ::: "+da);
		System.out.println("d--- >"+d);
		*/
//		getBatchID();
		
//		String regex ="([0-9]{2}[.][0-9]{2}[.][0-9]{2})";
		
		/*
		String regex ="((0[1-9]|1[0-9]|2[0-9]|3[01])[.]((0[1-9]{1}|)|1[012]){2}[.][0-9]{2})";//pattern check: xx.xx.xx. First two: 01-31,Second two:01-12, Third two: 00-99.
        
        Pattern p = Pattern.compile(regex);  
        Matcher m = p.matcher("32.12.23");  
        boolean b = m.matches();
        System.out.println(b);
        System.out.println(Pattern.matches(regex, "02.02.23"));
		*/
	
	
//    System.out.print(" BEFORE Current Time in milliseconds = ");
//    System.out.println(System.currentTimeMillis());
//    
//    System.out.println("Batch ID :: "+getBatchID());
//	System.out.println("Special Character Removed :: "+removeSpecialSymbols("SIR WILLIAM:$% NEWTON STR/EET,PORT LOUIS 0.. MUdsdsddsddsdgfgf"));
//	System.out.print(" AFTER Current Time in milliseconds = ");
//    System.out.println(System.currentTimeMillis());
    
    
	/*
	 * int digits = 1 + (int)Math.floor(Math.log10(1085));
	 * System.out.println(digits);
	 * 
	 * String strI = Integer.toString(551933); System.out.println(strI.length());
	 */
	
//		System.out.println("isCutoffTimeExpired ::: "+isCutoffTimeExpired("17:36"));		 
//		System.out.println("isCurrentDateTransaction :::"+isCurrentDateTransaction("20220805")); 
//		BigDecimal d1 = new BigDecimal(51.0);
//		BigDecimal d2 = new BigDecimal(50.00);
		
//		System.out.println(d1.compareTo(d2));
		
/*
 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); LocalDateTime
 * now = LocalDateTime.now(); System.out.println(dtf.format(now));
 */
		   
			
			/*
			 * String date = "05-09-2022"; date = date.replaceAll("-", "");
			 * System.out.println(date); System.out.println(date.replaceAll("-", ""));
			 */
	
	scheduleMessage obj = new scheduleMessage();

	obj.send("acutecmeeting@acumentechnologies.co.in", "acumen@123", "prince@acumentechnologies.co.in","New Meeting Schedule", "");
	 
	/*
	int k[] = {1,2,1,2,1,1,2,1,3,3,90};
	int n = 1;
	algo obj = new algo();
	HashMap<Integer,Integer> li = new  HashMap<Integer,Integer>();
	for (int i : k) {
		if(!li.containsKey(i)) {
//			li.put(i, obj.occurenceOfK(k, i));
			li.put(i, 1);
//			System.out.println("Frequency of " + i + " is " + li.get(i));
		}else {
			int temp = li.get(i);
			temp++;
			li.put(i,temp);
			
		}
	}
	for (int i : li.keySet()) {
			System.out.println("Frequency of " + i + " is " + li.get(i));
	}*/
//	System.out.println(li.keySet());
	/*
	int k[] = {1, 5, 7, 1};
	int n = 6;
	int count =0;
	HashMap<Integer,Integer> li = new  HashMap<Integer,Integer>();
	
	for (int i : k) {
		if (!li.containsKey(i) && !li.containsValue(i)) {
			li.put(i, n - i);
		} else{
			count++;
		}
	}
	System.out.println(count);
	 */
	/*
	 * int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}; int size = Arr.length+1; int
	 * res[] = new int[size]; int pos =0; int neg= 0; int temp = 0;
	 * 
	 * for (int i = 0; i < Arr.length; i++) { if(Arr[i]>0) { int k = (2*pos)%size;
	 * res[k]=Arr[i]; pos++; }else { int k = (2*neg+1)%size; res[k]=Arr[i]; neg++; }
	 * } for (int i = 0; i < res.length; i++) {
	 * 
	 * System.out.print(res[i]+" "); }
	 */
	
	}
	
	public boolean checkNull() throws IllegalAccessException {
	    for (Field f : getClass().getDeclaredFields()) {
	    	System.out.println("Field :: "+f.get(this));
	        if (f.get(this) != null)
	            return false;
	    }
	    return true;            
	}
	private static String getBatchID() { 
		String BatchTime=""; 
		DateFormat dfBatch = new SimpleDateFormat("HHmm");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0); 
		
		int startDate = cal.get(Calendar.DATE);
		String batch = dfBatch.format(new java.util.Date());
		int result = Integer.parseInt(batch);

		while (cal.get(Calendar.DATE) == startDate) {
			String batch1=(dfBatch.format(cal.getTime()));
			int temp = result/100; 
			result=result%100; 
			cal.add(Calendar.MINUTE, 30);
			  
			  if(result>30) {			  
				  if((temp*2+2)<10) { 
					  System.out.println("000"+(temp*2+2)); 
					  BatchTime = "000"+(temp*2+2); 
				  }else{ 
					  System.out.println("00"+(temp*2+2)); 
					  BatchTime = "00"+(temp*2+2); 
				  } break; 
			  } else{ 
				  if((temp*2+1)<10) {
					  System.out.println("000"+(temp*2+1)); 
					  BatchTime = "000"+(temp*2+1); 
				  }else{
					  BatchTime = "00"+(temp*2+1); 
					  System.out.println("00"+(temp*2+1)); 
				  } 
				  break; 
			  }
		} 
		
		System.out.println("Batch ID :: "+BatchTime); 
		return BatchTime; 
	}
	
	public static String removeSpecialSymbols(String arg0) {
		System.out.println("value:::::"+arg0);
		if(arg0==null || arg0.length()<0)
			return arg0;
		StringBuffer tempAlphaNumeric=new StringBuffer();
		String exp="[A-Za-z0-9@\\s:,]*";
		Pattern pattern=Pattern.compile(exp);
		for(int i=0;i<arg0.length();i++)
		{
			Matcher mTemp=pattern.matcher(arg0.charAt(i)+"");
			if(mTemp.matches())
				tempAlphaNumeric = tempAlphaNumeric.append(arg0.charAt(i));				
		}
		return tempAlphaNumeric.toString().trim();
//		return arg0.replace("[^A-Z][^a-z][^0-9][$&+,:;=?@#|'<>.-^*()%!�\\/]", "");
	}

	private static boolean isCurrentDateTransaction(String orgindate) throws ParseException {
		boolean flag = true;
		Date d = new Date();
		int yyyy = d.getYear()+1900;
		int mm = d.getMonth()+1;
		int dd = d.getDate();
		
		String m = null;
		String D = null;
		
		if(mm<10)
			m = "0"+mm;
		else
			m = ""+mm;
		
		if(dd<10)
			D = "0"+dd;
		else
			D = ""+dd;
		
		String sd = (yyyy)+""+(m)+""+D;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  

		Date date1 = sdf.parse(orgindate);  
		Date date2 = sdf.parse(sd);  

		System.out.println("Date 1: " + sdf.format(date1));  
		System.out.println("Date 2: " + sdf.format(date2));  
		//comparing dates  
		if(date1.compareTo(date2) > 0)   
		{
			flag = false;
		System.out.println("Date 1 comes after Date 2");  
		}   
	return flag;
	}

private static boolean isCutoffTimeExpired(String time1) throws ParseException {
	boolean flag = false;
	 SimpleDateFormat format = new SimpleDateFormat("HH:mm");
	 Date cutoff = format.parse(time1);
	 Date date3 = new Date();
	 Date currtime = format.parse(date3.getHours()+":"+date3.getMinutes());
	 if(cutoff.after(currtime)) {
		 flag = true;
		 System.out.println("After");
	 }
	 else {
		 flag = false;
		 System.out.println("before");
	 }
	 return flag;
}

public static Date getMsgRecvtime(String sDate1) {
	Date date1 = null;
	try {
		date1 = new SimpleDateFormat("yyyyMMdd").parse(sDate1);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return date1;
}}
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.net.*;

public class Testing {
	
	public static void main(String[] args) {
		
		String str = "FT22318P50QP||ACCT||NEFT Outward||INR||INR||400.00||||INR0.00||20221114||20221114||400.00||400.00||3251004500016288||3255004500078020||||||||336||336||||||||||||||||||||||||||||||||||||2211141605||20017_O26875__OFS_BROWSERTC||20020_O27350_OFS_BROWSERTC||IN0010001||||||325||INDIA||||||||||||||||||20221114||||||||3251004500016288||DEBIT PLUS CHARGES||FTNEFTCHG||||||||||||||||4500016||||||||20221114||MAT||1||||||||||||||||||||||||||||||INR400.00||INR400.00||||||||||SENDER||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||Y||||||||||||||||||||||||||||||CBS||NEFT||OCT||NBAD0000001||3251004500016288||11||FGB SCRAMBLE NAME-1||4500016test@gmail.com||1234567890||ALLA0210691||4723872435||||check 420||||||||||||||20221114160350||||||||||||2342342fedf||||||||||||||||FGB SCRAMBLE NAME-1||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.";
//		String str = "abc||def||da|ad||||";
		int count=0;
		String[] sar = str.split(Pattern.quote("||"));
		
//		String[] sar = str.split("\\|\\|");
//		System.out.println("SAR length:: "+sar.length);
		/*
		for(int i=0;i<sar.length;i++) {
			System.out.println((++count)+". "+sar[i]+" -->"+(count-1));
		}
		*/
		
		
		
		for (String string : sar) {
			
			if(string.isEmpty()) {
				System.out.print("NA,");
//				System.out.println((++count) + ". " + "NA"/* +" -->"+(count-1) */);
			}else {				
				System.out.print(string+",");
//				System.out.println((++count) + ". " + string/* +" -->"+(count-1) */);
			}
		}
		
		
//		System.out.println(useRegex("||"));
		
		
//		HashMap<String, String> list
		System.out.println();
		for(int i=0;i<254;i++) {
			System.out.print("?,");
		}
		System.out.println();
		String hostname, serverAddress;
		hostname = "error";
		serverAddress = "error";
		try {
			InetAddress inetAddress;
			inetAddress = InetAddress.getLocalHost();
			hostname = inetAddress.getHostName();
			serverAddress = inetAddress.toString();
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
		System.out.println(serverAddress.substring(serverAddress.indexOf("/")+1));
		System.out.println(hostname);
		
		
	}
	public static String removeSpecialSymbols(String arg0) {
		System.out.println("value:::::"+arg0);
		if(arg0==null || arg0.length()<0)
			return arg0;
		StringBuffer tempAlphaNumeric=new StringBuffer();
//		String exp="[A-Za-z0-9@\\s:,/.+()@;&`~*?!#$%^_=|{}-]*";
//		String exp="[A-Za-z0-9@\\s:,]*";
		String exp="[A-Za-z0-9\\s:/-?,']*";
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
	
    public static boolean useRegex( String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("^\\|\\|$", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }
}
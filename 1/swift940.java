import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class swift940 {
	public static void main(String[] args) {
		String msg = "{1:F01NBADINBBXXXX1105003747} \r\n"
				+ "{2:I940SGSEINB2XXXXN} \r\n"
				+ "{3:{108:129145}}{4:\r\n"
				+ ":20:20230403-273\r\n"
				+ ":25:3251004500093010\r\n"
				+ ":28C:273/1\r\n"
				+ ":60F:C230402INR1000,00\r\n"
				+ ":62F:C230403INR1000,00\r\n"
				+ ":64:C230403INR1000,00\r\n"
				+ "-}";
		
		String CROSS_REF_NO = msg.substring(msg.indexOf(":20:")+4, msg.indexOf(":25:"));
		String MESSAGE_TYPE = msg.substring(msg.indexOf("{2:I")+4, msg.indexOf("{2:I")+7);
		String MSG_IO_INDICATOR = msg.substring(msg.indexOf("{2:")+3, msg.indexOf("{2:")+4);
		String SENDER = msg.substring(msg.indexOf("{1:")+6, msg.indexOf("{1:")+18);
		String RECEIVER = msg.substring(msg.indexOf("{2:")+7, msg.indexOf("{2:")+19);
		
		System.out.println(msg);
		
		System.out.println("CROSS_REF_NO:: "+CROSS_REF_NO);
		System.out.println("MESSAGE_TYPE:: "+MESSAGE_TYPE);
		System.out.println("MSG_IO_INDICATOR:: "+MSG_IO_INDICATOR);
		System.out.println("SENDER:: "+SENDER);
		System.out.println("RECEIVER:: "+RECEIVER);
		
		
		try {
			Date date1=new SimpleDateFormat("yyyyMMdd").parse("20230602");
			System.out.println("date1: "+date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

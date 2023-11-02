import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
class OracleJdbcConn{  
	public static void main(String args[]){
		String ReferenceNo = "IND";
		Long cnt=null;
		
		 LocalDate myObj = LocalDate.now(); // Create a date object
		    System.out.println("Date:: "+myObj); // Display the current date
		    String d = myObj.toString().replaceAll("-","");
		    ReferenceNo += d;
//		    System.out.println("ReferenceNo: "+ReferenceNo);
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");   
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.15:1521:fab","rfms","rfms");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select REF_NO.nextval from dual");  
	
	while(rs.next()) {
	System.out.println("Seq no: "+rs.getLong(1));
	cnt = rs.getLong(1);
	}
	con.close();
	}catch(Exception e){
		System.out.println(e);
		}
	
	String linecounter = null;
	try { 
//		System.out.println("cnt"+cnt);
//		System.out.println("cnt__"+(int)Math.floor(Math.log10(cnt)));
		int digits = 1 + (int)Math.floor(Math.log10(cnt));
		System.out.println("Sequence Digits:: "+digits);
		 if(digits == 1)
			  linecounter = "0000"+cnt;
	     else if(digits == 2)
		      linecounter ="000"+cnt;
		 else if(digits == 3)
			  linecounter = "00"+cnt;
	     else if(digits == 4)
		      linecounter = "0"+cnt;
		 else
			  linecounter = ""+cnt;
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	ReferenceNo += linecounter;
	System.out.println("Final ReferenceNo : "+ReferenceNo);
	
	}  
}  

/*
 Logic:

First three fixed chars: IND

Next 8 chars can be used with calendar date: 20230518(example)

Remaining 5 chars can be used with recycled running sequence
 */

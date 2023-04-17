import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class my_update{
	
void  my_db_update(String str1, String str2,String str3,String str4,String str5) {
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/jeevraj","root","oracle123");
	Statement st=con.createStatement();  
	int mark = Integer.parseInt(str3); // Mark is an integer
	
	String query1="INSERT INTO `jeevraj`.`student1`"
	 + " (`name`, `class`, `rollno`, `gender`,`DOB`)"
	 + "VALUES('" +str1+"','"+str2+"',"+mark+",'"+str4+"','"+str5+"')";
	st.executeUpdate(query1); // record added. 
	
	con.close();  
	
}catch(Exception e){ System.out.println(e);} 
	//////////////////////////////
}
}
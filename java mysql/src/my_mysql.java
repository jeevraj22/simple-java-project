import java.sql.*;
public class my_mysql {

public  String[][] my_db_select() {
////////////
String[][] data = new String[6][6]; // [rows][columns]
	
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/jeevraj","root","oracle123");  
	Statement st=con.createStatement();  
	
	ResultSet rs=st.executeQuery("SELECT * FROM student1 LIMIT 0,5"); 
// Looping to store result in returning array data // 
	int i=0;
	while(rs.next())  {
	 for(int j=0;j<6;j++) {
	 //System.out.print(rs.getString(j+1));
	 data[i][j]=rs.getString(j+1);
	 }
	 //System.out.println();
	 i=i+1;
	}
con.close();  
}catch(Exception e){ System.out.println(e);} 
//////////////////////////////

return data;
	}
}
	
	

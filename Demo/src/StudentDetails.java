import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDetails {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
     
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/INFO","root","Aryanroy098@");
    	 
    	Statement st = con.createStatement();
    	
    	ResultSet rs = st.executeQuery("Select * from STUDENT_INFO");
    	
    	while(rs.next()) {
    	System.out.println(" " + rs.getInt(1));
    	}
    
    	con.close(); }
	}

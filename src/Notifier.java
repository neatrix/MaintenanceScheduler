import java.sql.*;

public class Notifier {
	public void methodNotifier() {
		
		 
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/maindatabase?useTimezone=true&serverTimezone=UTC", "root", "root");
	
			
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select name,products,email from maintable where future_day = curdate()");  
		while(rs.next())  {
		System.out.println(rs.getString(1)+" isimli musterinin '"+rs.getString(2)+"' urunun bakim zamani gelmistir.");  
		System.out.println(rs.getString(3)+" adresine mail iletilmistir.");}
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}
}

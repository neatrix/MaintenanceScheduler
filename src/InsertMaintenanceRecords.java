import java.sql.*;
import java.sql.DriverManager;
import java.util.Date;

public class InsertMaintenanceRecords {

	public void insertRecords(String name,String email,String options,String products,String created_at,String future_day ){
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/maindatabase?useTimezone=true&serverTimezone=UTC", "root", "root");
			

			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO maintable (name,email ,options ,products ,created_at ,future_day ) VALUES (?,?,?,?,?,?);");
			stmt.setString(1,name);
			stmt.setString(2,email);
			stmt.setString(3,options);
			stmt.setString(4,products);
			stmt.setString(5,created_at);
			stmt.setString(6,future_day);
		
			stmt.executeUpdate();
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("errooorrrrr");
		}
	}
	
	
}

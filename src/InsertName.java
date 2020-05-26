import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertName {

	public void methodInsert(String name, String pass) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/etiya1?useTimezone=true&serverTimezone=UTC", "root", "root");

			PreparedStatement stmt = con.prepareStatement("insert into userreg values(?,?)");

			stmt.setString(1, name);
			stmt.setString(2, pass);
			stmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("errooorrrrr");
		}

	}

}

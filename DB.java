package MyPackage;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	static Connection con = null;
	public static Connection  connect() {
		try {
	        String url = "jdbc:mysql://localhost:3306/employee";
	        String userName = "root";
	        String password = "password@123#";
	        
	        con = DriverManager.getConnection(url,userName,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

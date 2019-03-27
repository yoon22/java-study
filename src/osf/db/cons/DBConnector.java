package osf.db.cons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER ="osfu";
	private static final String PASSWORD="12345678";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static Connection con = null;
	
	private static Connection open() {
		
		try {
			Class.forName(DRIVER );
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void close() {
		if(con!=null) {
			try {
				if(!con.isClosed()) {
					con.close();
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
	}
	
	
}
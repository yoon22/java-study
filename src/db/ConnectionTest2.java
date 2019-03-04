package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {

	public static void main(String[] args) {		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			String sql = "select bi_num, bi_title, bi_content"
					+ " ,bi_credat, bi_cretim, bi_cnt"
					+ " ,bi_isactive from board_info";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList = new ArrayList<>();
			
			while(rs.next()) {
				HashMap<String,String> row = new HashMap<>();
				String biTitle = rs.getString("bi_title");
				String biNum = rs.getString("bi_num");
				row.put("biNum",biNum);
				row.put("biTitle", biTitle);
				row.put("biContent",rs.getString("bi_Content"));
				row.put("biCredat",rs.getString("bi_Credat"));
				row.put("biCretim",rs.getString("bi_Cretim"));
				row.put("biCnt",rs.getString("bi_Cnt"));
				row.put("biIsactive",rs.getString("bi_Isactive"));
				
				rowList.add(row);	
			}
			for(int i =0;i<rowList.size();i++) {
				System.out.println(rowList.get(i));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "update board_info " + "set bi_title=?," 
						+ "bi_content=?" + " where bi_num =? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "안뇽");
			ps.setString(2, "내가누구게!");
			ps.setInt(3, 4);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상처리");
			} else {
				System.out.println("오류는 아닌데 업뎃 안됨");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

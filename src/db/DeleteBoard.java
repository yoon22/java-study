package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pwd);
			String sql = "delete from board_info where bi_num=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 4);
			int cnt = ps.executeUpdate();
			//executeUpdate 쓰는 이유는!!몇개의 로우가 삭제되었는지가 중요하니까?? ? ? 
			// update , delete, insert
			//executeQuery 는 셀렉트?? 쓸때 씀. 
			if(cnt==1){
				System.out.println("삭제!!");
			}else {
				System.out.println("이미 없어용");
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";  
		Connection con = null; //
		
		try {
			con = DriverManager.getConnection(url,id,pwd);
			String title = "안녕하세요!";
			String content = "반갑습니당 ㅎㅅㅎ";
			String sql = "insert into board_info";
			sql += "(bi_num,bi_title,bi_content,\r\n" + 
					"bi_credat,bi_cretim)";
			sql += "values(3,?,?,to_char(sysdate,'yyyymmdd'),to_char(sysdate,'hh24miss'))";
			PreparedStatement ps = con.prepareStatement(sql); //준비되어있는? 스테이트먼트
			ps.setString(1,title);
			ps.setString(2,content);
			int cnt = ps.executeUpdate(); //정상적으로 들어가게 된다면 cnt = 1 이 나옴. 
			System.out.println(cnt);
			if(cnt==1) {
				System.out.println("정상적으로 입력됨!");
			}else if(cnt==0) {
				System.out.println("안들어감! ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
			
	public static void main(String[] args) {		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con =DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement(); //쿼리박스 하얀화면과 같음.
			String sql = "select * from board order by num"; //이 실행문을 쿼리박스에 입력해야함
			stmt.executeQuery(sql); //쿼리박스인 stmt 에 넣어줌!!! 
			 
			//그다음은 실행해야함. 실행하는 쿼리박스는 실행하는법이 Ctrl + enter
			//지만 이클립스에는 없으니 만들어줘야함..
			//executeQuery 위에 마우스 올리면 데이터타입 ResultSet 임. 
			//그래서 밑에처럼 넣어줌.
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){ // 한 행씩 이동하면서 데이터가 없어서 false가 
				//뜰때까지 반복함!!!!! 
				System.out.println();
				System.out.print(rs.getString("num")+", ");				
				System.out.print(rs.getString("title")+", ");
				System.out.print(rs.getString("reg_date")+", ");
				System.out.print(rs.getString("content")+", ");
			}
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

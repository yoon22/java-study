package db.board3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService {
	public List<BoardInfoNTT> selectBoard() { //조회 메소드 만들기
		//정해져있지 않은 데이터타입의 초기값은 null 
		String sql = "select * from board_info"; //조회 sql문 만들어놓기.
		Connection con = DBCon.getCon(); //전화연결! 
		
		
		
		try {
			PreparedStatement ps = con.prepareStatement(sql); //연결된 화면에 sql문 넣기 .
			ResultSet rs = ps.executeQuery(); //넣은 sql 실행하기. 
			List<BoardInfoNTT> biList= new ArrayList<>();
			
			while(rs.next()) { //다음 행이 없을때까지 반복!
				BoardInfoNTT bi = new BoardInfoNTT(); //List<BoardInfoNTT> 에 넣을내용? 
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				
				biList.add(bi); //불러온 내용을 biList 에 넣기. 			
			}

			return biList;  //try 영역 안 모두 실행하고 biList에 내용 저장해두기.
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally {
			DBCon.close(); //try 하던 catch 하던 무조건 실행하게끔! 전화가 끊기도록. 
		}
		
		return null;
	}
	
	

}

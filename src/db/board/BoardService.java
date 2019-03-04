package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {
	public void selectBoard() {
		String sql = "select * from board_info order by bi_num ";
		PreparedStatement ps;
		try {
			ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("< 글 번호 / 게시글 이름 > ");
			while (rs.next()) {
				System.out.println(rs.getString("bi_num") + " : "+ rs.getString("bi_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}

	}

	public void insertBoard(String title, String content) {
		String sql = "insert into board_info (bi_num,bi_title,bi_content,bi_credat,bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'yyyymmdd'),to_char(sysdate,'hh24miss'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("▶ 정상적으로 게시물이 등록되었습니다. ◀");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void deleteBoard(int num) {
		String sql = "delete from board_info where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setInt(1,num);
			int del = ps.executeUpdate();
			if(del ==1) {
				System.out.println("▶ 게시물이 정상적으로 삭제되었습니다. ◀");
			}else {
				System.out.println("▶ 게시물이 존재하지 않습니다. ◀ ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateBoard(String title,String content,int num) {
		String sql = "update board_info set bi_title=? ,bi_content=? where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1,title);
			ps.setString(2, content);
			ps.setInt(3,num);
			
			int up = ps.executeUpdate();
			if(up==1) {
				System.out.println("▶ 게시물이 수정되었습니다. ◀");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
}

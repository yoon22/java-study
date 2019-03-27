package osf.db.cons;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.board.DBCon;

public class userInfo {

	public List<Map<String,String>> selectUserList(Map<String,String> user) {
		String sql = "select * from user_info";
		List<Map<String,String>> userList = new ArrayList<>();
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> u = new HashMap<>();
				u.put("ui_num", rs.getString("ui_num"));
				u.put("ui_name", rs.getString("ui_name"));
				u.put("ui_age", rs.getString("ui_age"));
				userList.add(u);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return userList;
	}
	public int insertUser(Map<String,String> user) {
		String sql = "insert into user_info(ui_num,ui_name,ui_age)";
		sql +=" values(?,?,?)";
		
		PreparedStatement ps;
		try {
			ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, user.get("ui_num"));
			ps.setString(2, user.get("ui_name"));			
			ps.setString(3, user.get("ui_age"));	
			
			return ps.executeUpdate();			
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return 0;
	}
	public int updateUser(Map<String,String> user) {
		String sql = "update user_info set ui_name=? ,ui_age=? where ui_num=?";
		
		PreparedStatement ps;
		try {
			ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, user.get("ui_name"));
			ps.setString(2, user.get("ui_age"));			
			ps.setString(3, user.get("ui_num"));	
			
			return ps.executeUpdate();			
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteUser(Map<String,String> user) {
		String sql = "delete from User_info where ui_num=?";
		
		PreparedStatement ps;
		try {
			ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, user.get("ui_num"));	
			
			return ps.executeUpdate();			
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		userInfo ui = new userInfo();
		
		System.out.println(ui.selectUserList(null));
		
		Map<String,String> user = new HashMap<>();	
		user.put("ui_num", "3");

		
		System.out.println(ui.deleteUser(user));
		
	}

	
}

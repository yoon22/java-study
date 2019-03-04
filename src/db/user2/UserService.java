package db.user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.user.UserInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser(UserInfoVO uivo){
		String sql = "select * from user_info where 1=1"; //1=1 없으면 오류.
		//
		if(uivo!=null) {
			if(uivo.getUiId()!=null) {
				sql += " and ui_id = ?"; //기존의 sql 에서 추가.
			}
			if(uivo.getUiName()!=null) {
				sql += " and ui_name = ?";
			}
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			//sql을 만들어 놓은 상태! ? 자리에 값을 넣어준 후 실행해야함. 
			int cnt = 1;
			//sql문에 "?" 의 수가 많아질 경우를 위해 생성.
			if(uivo!=null) {
				if(uivo.getUiId()!=null) {					
					ps.setString(cnt++, uivo.getUiId());
				}
				if(uivo.getUiName()!=null) {				
					ps.setString(cnt++, uivo.getUiName());
			}
			}
			ResultSet rs = ps.executeQuery();
			List<UserInfoVO> uiList = new ArrayList<>();
			while (rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				uiList.add(ui);
						
			}
			
			return uiList; //while문 끝나고 return
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; //selectUser 에 대한 return 
	}
}

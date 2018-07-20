package test26.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test26.DBCon;
import test26.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	private Connection con;
	
	public UserDAOImpl() {
	}

	@Override
	public int insertUerInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		int result = 0;
		String sql = "insert into userinfo";
		sql += "(uiName ,uiAge, uiCredat, uiCretim, uiEtc,uiDelete)";
		sql += "values(?,?,date_format(now(),'%Y%m%d'),date_format(now(),'%H%i%s'),?,'0')";
		if(userInfo != null) {
			if(userInfo.get("uiName") != null) {
				sql += "where uiName=?";
			}
		}
		try {
		 PreparedStatement ps = this.con.prepareStatement(sql);
		 
		 ps.setString(1, userInfo.get("uiName"));
		 ps.setString(2, userInfo.get("ulAge"));
		 ps.setString(3, userInfo.get("uiEtc"));
		 result = ps.executeUpdate();
		 this.con.commit();
		}catch (SQLException e) {
			try {
				this.con.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBCon.closeCon();
		}
		
		return result;
	}

	@Override
	public int deleteUerInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUerInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList(HashMap<String, String> userInfo) {
		ArrayList<HashMap<String, String>> userInfoList = new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();
		String sql = "select uiNum,uiName,uiAge,uiCredat,uiCretim,uiEtc,uiDelete from userinfo";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String,String> user = new HashMap<String,String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				user.put("uiCredat", rs.getString("uiCredat"));
				user.put("uiCretim", rs.getString("uiCretim"));
				user.put("uiEtc", rs.getString("uiEtc"));
				user.put("uiDelete", rs.getString("uiDelete"));
			 	userInfoList.add(user);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.closeCon();
		}
		return userInfoList;
	}

}
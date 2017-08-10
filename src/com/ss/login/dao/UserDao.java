package com.ss.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ss.common.DbUtil;
import com.ss.login.pojo.Admin;


public interface UserDao {

	public Admin select(String uname,String upwd) throws SQLException;
	
	public Admin queryById(int user_id) throws SQLException;

	public Admin queryByUserId(int user_id) throws SQLException;
	
	public Boolean register(String rtel, String rname,String rpwd) throws SQLException;
}



///**
// * 登陆界面的dao层数据
// * @author Administrator
// *
// */
//public class AdminDao {
//	//根据员工的id来登陆
//	public Admin queryByUserId(int userId) throws SQLException{
//		Connection conn = DbUtil.getConnection();
//		Admin admin = null;
//		String sql = "select * from users where userId = ?";
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		
//		pstmt.setInt(12311, userId);
//		ResultSet rs = pstmt.executeQuery();
//		
//		if (rs.next()) {
//			Admin adm = new Admin();
//			adm.setUserId(userId);
//			
//		}
//		
//		rs.close();
//		pstmt.close();
//		conn.close();
//		
//		return admin;
//	}
//}
package com.ss.login.doimpl;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.ss.common.DbUtil;

import com.ss.login.dao.UserDao;
import com.ss.login.pojo.Admin;

public class  UserDaoImpl implements UserDao {

	//根据id查询后台是否有此用户名
	@Override
	public Admin queryByUserId(int user_id) throws SQLException{
		Connection conn = (Connection) DbUtil.getConnection();
		
		Admin admin = null;
		
		String sql = "select * from user where user_id = ?";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		
		pstmt.setInt(1,user_id);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			admin=new Admin();
			admin.setUser_id(rs.getInt(1));
			admin.setUser_name(rs.getString(2));
			admin.setUser_password(rs.getString(3));
			admin.setUser_email(rs.getString(4));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return admin;
	}



//	注册
	
	@Override
	public Boolean register(String rtel, String rname,String rpwd) throws SQLException{
		
		Connection conn = (Connection) DbUtil.getConnection();
		
		StringBuffer sb = new StringBuffer();		
		sb.append("SELECT * ");
		sb.append("FROM user where user_id = ?");
		
		PreparedStatement pstm=(PreparedStatement) conn.prepareStatement(sb.toString());
		pstm.setString(1,rtel);
		ResultSet rs=pstm.executeQuery();
		Boolean result = null;
		
		if(rs.next()){
			result = false;
		}else {
			sb = new StringBuffer();		
			sb.append("insert into user ");
			sb.append("values(?,?,?,?)");
			
			pstm=(PreparedStatement) conn.prepareStatement(sb.toString());
			System.out.println(sb.toString());
			pstm.setString(1,rtel);
			pstm.setString(2,rname);
			pstm.setString(3,rpwd);
			pstm.setString(4,"");
			pstm.executeUpdate();
			result = true;
		}
		
		rs.close();
		pstm.close();
		conn.close();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Admin select(String uname, String upwd) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin queryById(int user_id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}

//public class UserDaoImpl implements AdminDao {

//	@Override
//	public Admin select(String uname,String upwd) throws SQLException{
//		
//		Connection conn = (Connection) DbUtil.getConnection();
//		
//		StringBuffer sb = new StringBuffer();		
//		sb.append("SELECT * ");
//		sb.append("FROM user where user_name = ? and user_password = ? ");
//		
//		PreparedStatement pstm=(PreparedStatement) conn.prepareStatement(sb.toString());
//		pstm.setString(1,uname);
//		pstm.setString(2,upwd);
//		ResultSet rs=pstm.executeQuery();
//		Admin admin=null;
//		if(rs.next()){
//			admin=new Admin();
//			admin.setUser_id(rs.getInt(1));
//			admin.setUser_name(rs.getString(2));
//			admin.setUser_password(rs.getString(3));
//			admin.setUser_email(rs.getString(4));
//		}
//		return admin;
//	}
	//根据员工的id来登陆
//		public Admin queryByUserId(Integer user_id) throws SQLException{
//			Connection conn = (Connection) DbUtil.getConnection();
//			
//			
//			
//			Admin admin = null;
//			String sql = "select * from employee where user_id = ?";
//			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
//			
//			pstmt.setInt(1,user_id);
//			ResultSet rs = pstmt.executeQuery();
//			
//			if (rs.next()) {
//				admin=new Admin();
//				admin.setUser_id(rs.getInt(1));
//				admin.setUser_name(rs.getString(2));
//				admin.setUser_password(rs.getString(3));
//				admin.setUser_email(rs.getString(4));
//			}
//			
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
//			return admin;
//		}
//}
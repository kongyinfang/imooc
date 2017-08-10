package com.ss.community.doimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.ss.common.DbUtil;
import com.ss.community.dao.CommunityDao;
import com.ss.community.pojo.Community;
import com.ss.login.dao.UserDao;

public class CommunityDaoImpl  implements CommunityDao{
	
	public Community queryAllBlog(String blog_start){
		
		Community community = new Community();
		
	
		
		
		return community;
	}
	public Boolean createQuestion(int question_id,String question_title, String question_content,
			String question_start,int quest_num, int question_last, int user_id )
		throws SQLException{
		Connection conn = (Connection) DbUtil.getConnection();
		
		StringBuffer sb = new StringBuffer();
		sb.append("insert into question	 values (?,?,?,?,?,?,?)");		
		
		Community community = new Community();
		
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sb.toString());
		
		
		pstmt.setInt(1, question_id);
		pstmt.setString(2, question_title);
		pstmt.setString(3, question_content);
		pstmt.setString(4, question_start);
		pstmt.setInt(5, quest_num);
		pstmt.setInt(6, question_last);
		pstmt.setInt(7, user_id);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		return true;	
		
	}
	
	public int lengthCommunity()throws SQLException{
		int length = 0;
		Connection conn = (Connection) DbUtil.getConnection();
		
		StringBuffer sb = new StringBuffer();
		sb.append("select count(*) from question ");		
		
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();
		rs.next();		
		length = rs.getInt(1);
		
		pstmt.close();
		conn.close();		
		
		return length;
		
	}
}

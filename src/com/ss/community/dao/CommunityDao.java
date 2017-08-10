package com.ss.community.dao;

import java.sql.SQLException;
import java.util.Date;

import com.ss.community.pojo.Community;

public  interface  CommunityDao {
	public Community queryAllBlog(String blog_start) throws SQLException;
	
	public Boolean createQuestion(int question_id,String question_title, String question_content,
			String question_start,int quest_num, int question_last, int user_id) throws SQLException;
	
	public int lengthCommunity() throws SQLException;

}

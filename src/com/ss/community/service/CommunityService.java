package com.ss.community.service;

import java.sql.SQLException;
//import java.util.Date;

import com.ss.community.dao.CommunityDao;
import com.ss.community.doimpl.CommunityDaoImpl;

public class CommunityService {
	
	private CommunityDao dao =  (CommunityDao) new CommunityDaoImpl();
	
	public Boolean createQuestion(String question_title, String question_content,
			String question_start,int quest_num, int question_last, int user_id )
		throws SQLException{
		int length = dao.lengthCommunity()+1;
		System.out.println(length);
		return dao.createQuestion(length,question_title,question_content,question_start,quest_num,
				question_last,user_id);
	}
	
//	public createQuestion(){
//		
//	}
//
}

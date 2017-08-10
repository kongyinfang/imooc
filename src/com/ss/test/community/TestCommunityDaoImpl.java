package com.ss.test.community;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;


import com.ss.community.doimpl.CommunityDaoImpl;
import com.ss.community.pojo.Community;


public class TestCommunityDaoImpl {
	
	CommunityDaoImpl dao = new CommunityDaoImpl();
	@Test
	public void TestCreateQuestion()throws SQLException{
		
	//	insert into blog values (1124241,12,"dfsf","sdk","sgs","affa");
		
		Community dao = new Community(3,"aa","sfdsfsfsd","2013-2-3 12:23:23",11,0,333);
		System.out.println(dao.toString());

	}
	
	@Test
	public void TestLengthCommunity()throws SQLException{
		System.out.println(dao.lengthCommunity());
	}

}

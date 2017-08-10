package com.ss.test.community;

import java.sql.SQLException;

import org.junit.Test;

import com.ss.community.service.CommunityService;

public class TestCommunityService {

	CommunityService service = new CommunityService();
	@Test
	public void TestCreateQuestion()throws SQLException{
		System.out.println(service.createQuestion("jsfhs", "xzjhdhjd","2017-6-23 00.12.12",
				123, 11, 333));
	}
}

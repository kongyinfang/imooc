package com.ss.test.Login;

import java.sql.SQLException;

import org.junit.Test;

import com.ss.login.dao.UserDao;
import com.ss.login.doimpl.UserDaoImpl;
import com.ss.login.pojo.Admin;



/**
 * ²âÊÔµÇÂ½µÄdao²ã
 * @author Administrator
 *
 */
public class TestAdminDao {
	
	UserDaoImpl dao = new UserDaoImpl();
	@Test
	public void testAdminDao() throws SQLException{
		Admin admin = dao.queryByUserId(12311);
		System.out.println(admin);
	}
}
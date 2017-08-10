package com.ss.test.Login;

import java.sql.SQLException;

import org.junit.Test;

import com.ss.login.pojo.Admin;
import com.ss.login.service.LoginService;

public class TestLoginService {

	LoginService service = new LoginService();

	@Test
	public void testAdminService() throws SQLException{
		
		Admin admin = new Admin();
		admin.setUser_id(12311);
		admin.setUser_name("kkk");
		admin.setUser_password("123456");
		System.out.println(service.checkLogin(admin));
	}
}

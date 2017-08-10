package com.ss.register.service;

import java.sql.SQLException;

import com.ss.login.dao.UserDao;
import com.ss.login.doimpl.UserDaoImpl;
//import com.ss.login.pojo.Admin;

public class RegisterService {
	private UserDao dao = new UserDaoImpl();

	public Boolean register(String rtel, String rname,String rpwd) throws SQLException{
		return dao.register(rtel,rname,rpwd); 
	}

}

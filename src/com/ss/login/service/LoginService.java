package com.ss.login.service;

import java.sql.SQLException;

import org.apache.catalina.User;


import com.ss.login.dao.UserDao;
import com.ss.login.doimpl.UserDaoImpl;
import com.ss.login.pojo.Admin;

public class LoginService {
	private UserDao dao = new UserDaoImpl();
	
	public Admin select(String uname,String upwd) throws SQLException{
		return dao.select(uname,upwd); 
	}
	
	public Admin queryByUserId (int user_id)throws SQLException{
		return dao.queryByUserId(user_id);
	}


	/**
	 * ����¼
	 * @param admin
	 * @return	1�޴��û�  2�������  3��½�ɹ�
	 * @throws SQLException
	 */
	public int checkLogin(Admin admin) throws SQLException{
		
		Admin ad = dao.queryByUserId(admin.getUser_id());
	//	Admin ad = dao.queryByEmpId(admin.getEmp().getEmpId());
		if(ad == null){
			return 1;
		}else if(!(ad.getUser_password().equals(admin.getUser_password()))){
			return 2;
		}else{
			
			return 3;
		}
	} 
}

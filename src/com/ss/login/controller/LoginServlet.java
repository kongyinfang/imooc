package com.ss.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import com.icss.lhm.common.StringUtil;

import com.google.gson.Gson;
import com.ss.login.pojo.Admin;
import com.ss.login.service.LoginService;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//文本输出流打印对象
		PrintWriter out = response.getWriter();
		//获取前台数据
		String username = request.getParameter("username");
		String passwd = request.getParameter("password");
		
		//封装对象
		LoginService service = new LoginService();		
		Admin admin = null;
		int result = 0;
		try {
		
			admin = service.queryByUserId(Integer.parseInt(username));
			if(admin!=null){
				admin.setUser_password(passwd);
				result = service.checkLogin(admin);
			}else{
				//不存在返回1
				result = 1;
			}
			//如果登陆成功，在会话中记录
			if (result == 3) {
				//将数据传回前端
				out.write(admin.getUser_name());
				//输出到控制台，查看是否有返回信息
				System.out.println(admin.getUser_name());
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}



}
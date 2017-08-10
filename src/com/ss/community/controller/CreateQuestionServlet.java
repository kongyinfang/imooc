package com.ss.community.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ss.common.StringUtil;
import com.ss.community.service.CommunityService;
import com.ss.register.service.RegisterService;

/**
 * Servlet implementation class CreateQuestionServlet
 */
@WebServlet("/CreateQuestionServlet")
public class CreateQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String question_title = request.getParameter("question_title");
		String question_content = request.getParameter("question_content");
		
		System.out.println("username  "+username);
		System.out.println("question_title  "+  question_title);
		System.out.println("question_content  "+question_content);
		CommunityService service = new CommunityService();
		Date date = new Date();
		SimpleDateFormat ft =  new SimpleDateFormat ("kk:mm:ss yyyy-MM-dd");
		String question_start=ft.format(date) ;
		
		int question_last = 121;
		username = "123";
//		String question_start = StringUtil.;
		try {
			Boolean result = service.createQuestion(question_title, question_content, question_start, 
					123, question_last, Integer.parseInt(username));

			System.out.println("result:  "+result);
//			
			PrintWriter out = response.getWriter();
//			ajax
			out.write(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

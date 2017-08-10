package com.ss.test.course;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;


import com.ss.course.doimpl.CourseDaoImpl;
import com.ss.course.pojo.Course;

public class TestCourseDaoImpl {

	CourseDaoImpl dao = new CourseDaoImpl();
	
	@Test
	public void TestQueryAll()throws SQLException{
		
		
		ArrayList<Course> list = dao.queryAll("1","7","1");
		
		for (Course course : list) {
			System.out.println(course.toString());
			
		}

	}
}

package com.ss.test.course;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.ss.course.pojo.Course;
import com.ss.course.service.CourseService;

public class TestCourseService {

	
	@Test
	public void TestQueryAll()throws SQLException{
		
		CourseService service = new CourseService();
		
		ArrayList<Course> list = service.queryAll("Ç°¶Ë","Ç°¶Ë","2");
		
		for (Course course : list) {
			System.out.println(course.toString());
			
		}

	}
}

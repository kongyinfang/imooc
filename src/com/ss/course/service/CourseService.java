package com.ss.course.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ss.course.pojo.Course;
import com.ss.course.dao.CourseDao;
import com.ss.course.doimpl.CourseDaoImpl;

public class CourseService {

	private CourseDao dao = new CourseDaoImpl();
	
	public ArrayList<Course> queryAll(String direction, String classification,String rank) throws SQLException{
		
		if("ȫ��".equals(direction)){
			direction = null;
		}
		if("ȫ��".equals(classification)){
			classification = null;
		}
		if("ȫ��".equals(rank)){
			rank = null;
		}
		
		return dao.queryAll(direction, classification, rank);
	}
	
}

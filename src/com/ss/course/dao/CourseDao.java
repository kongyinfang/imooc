package com.ss.course.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import com.ss.course.pojo.Course;

public interface CourseDao {
	
	//Course course = new Course();
	public ArrayList<Course> queryAll(String direction,String classification,String rank) throws SQLException;
}

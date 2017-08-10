package com.ss.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DbUtil {
	/**
	 * 获得数据库连接
	 * characterEncoding=UTF-8,
	 */
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/immooc?useSSL=false";
		String user = "root";
		String password = "root";

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 通用关闭连接方法
	 */
	public static void close(ResultSet rs, PreparedStatement st, Connection conn)
			throws SQLException {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}
	}

}














//public class DbUtil {
//	/**
//	 * 数据库工具类
//	 * 返回数据库连接
//	 * @author Administrator
//	 *
//	 */
//
//		public static Connection getConnection() throws SQLException {
//			//DriverManager.registerDriver(new java.sql.Driver());
//			//声明Connection对象
//		   // Connection conn;
//		    //驱动程序名
//		//    String driver = "com.mysql.jdbc.Driver";
//		   //URL指向要访问的数据库名mydata
//		   String url = "jdbc:mysql://localhost:3306/immooc";
//		  //MySQL配置时的用户名
//	       String user = "root";
//	      //MySQL配置时的密码
//		   String password = "root";
////			String url = "jdbc:oracle:thin:@localhost:1521:xe";
////			String user = "scott";
////			String password = "tiger";
//			
//			Connection conn = DriverManager.getConnection(url, user, password);
//			
//			return conn;		
//		}
//			
//	
//
//}

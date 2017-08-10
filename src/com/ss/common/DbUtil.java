package com.ss.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DbUtil {
	/**
	 * ������ݿ�����
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
	 * ͨ�ùر����ӷ���
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
//	 * ���ݿ⹤����
//	 * �������ݿ�����
//	 * @author Administrator
//	 *
//	 */
//
//		public static Connection getConnection() throws SQLException {
//			//DriverManager.registerDriver(new java.sql.Driver());
//			//����Connection����
//		   // Connection conn;
//		    //����������
//		//    String driver = "com.mysql.jdbc.Driver";
//		   //URLָ��Ҫ���ʵ����ݿ���mydata
//		   String url = "jdbc:mysql://localhost:3306/immooc";
//		  //MySQL����ʱ���û���
//	       String user = "root";
//	      //MySQL����ʱ������
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

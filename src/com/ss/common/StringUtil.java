package com.ss.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	
	 public String toString(Date date){
		 
		 String str = String.format("%tT %tF", date,date );
		 
		 return str;
	 }
	 
	 public String createDate(){
		 Date date = new Date();	      
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("kk:mm:ss yyyy-MM-dd");
	      
		 String aa=ft.format(date) ;
	     return aa;
	 }
	
//	 public static void main(String args[]) {
//
//	      
//	      
//	      String str = String.format("Current Date/Time : %tT %tF", date,date );
//
//	      System.out.printf(str);
//	   }
		

	
	
}

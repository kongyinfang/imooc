package com.ss.community.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Community {
	private int question_id;	
	private String question_title;
	private String question_content;
	private String question_start;
	private int question_num;
	private int question_last;
	private int user_id;
	
	public Community(String question_title, String question_content,
			String question_start, int question_num, int question_last,
			int user_id) {
		super();
		this.question_title = question_title;
		this.question_content = question_content;
		this.question_start = question_start;
		this.question_num = question_num;
		this.question_last = question_last;
		this.user_id = user_id;
	}

	public Community(int question_id, String question_title,
			String question_content, String question_start, int question_num,
			int question_last, int user_id) {
		super();
		this.question_id = question_id;
		this.question_title = question_title;
		this.question_content = question_content;
		this.question_start = question_start;
		this.question_num = question_num;
		this.question_last = question_last;
		this.user_id = user_id;
	}

	public Community() {
		super();
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_title() {
		return question_title;
	}

	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}

	public String getQuestion_content() {
		return question_content;
	}

	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}

	public String getQuestion_start() {
		return question_start;
	}

	public void setQuestion_start(String question_start) {
		this.question_start = question_start;
	}

	public int getQuestion_num() {
		return question_num;
	}

	public void setQuestion_num(int question_num) {
		this.question_num = question_num;
	}

	public int getQuestion_last() {
		return question_last;
	}

	public void setQuestion_last(int question_last) {
		this.question_last = question_last;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Community [question_id=" + question_id + ", question_title="
				+ question_title + ", question_content=" + question_content
				+ ", question_start=" + question_start + ", question_num="
				+ question_num + ", question_last=" + question_last
				+ ", user_id=" + user_id + "]";
	}


}

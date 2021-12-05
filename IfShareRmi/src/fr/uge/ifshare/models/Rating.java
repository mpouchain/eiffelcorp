package fr.uge.ifshare.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rating implements Serializable {
	private final int grade;
	private final int state;
	
	public Rating(int grade, int state) {
		this.grade = grade;
		this.state = state;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getState() {
		return state;
	}
}

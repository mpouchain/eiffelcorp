package web.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rating implements Serializable {
	private int note;
	private int state;
	
	public Rating()  {}
	
	public Rating(int note, int state) {
		this.note = note;
		this.state = state;
	}
	
	public int getNote() {
		return note;
	}
	
	public int getState() {
		return state;
	}
}

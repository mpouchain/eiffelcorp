/**
 * Rating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uge.corp.bank.common;
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

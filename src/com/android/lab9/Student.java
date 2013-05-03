package com.android.lab9;

public class Student {
	
	private int studentId;
	private String name;
	private String describe;
	
	public void Member() {
		
	}
	
	public void Member(String name, String describe) {
		this.name = name;
		this.describe = describe;
	}
	
	public void Member(int id, String name, String describe) {
		this.studentId = id;
		this.name = name;
		this.describe = describe;
	}
	
	public int getId(){
		return this.studentId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescribe(){
		return this.describe;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDescripe(String describe){
		this.describe = describe;
	}
}
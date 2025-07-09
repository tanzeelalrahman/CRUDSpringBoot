package com.example.STUDENTCRUD1.model;
import jakarta.persistence.*;

@Entity

public class Student {
	@Id //this marks primary key uid 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	public String grade;
	public String name;
	
	public Student(String name,String grade) {
		this.name=name;
		this.grade=grade;
	}
	
	public Student(long ID) {
		this.ID=ID;
	}
	
	public Student(){
		
	}
	public void setId(long ID) {
		this.ID=ID;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setgrade(String grade) {
		this.grade=grade;
	}
	public long getId() {
		return ID;
	}
	public String getname() {
		return name;
	}
	public String getgrade() {
		return grade;
	}
	
	public String grade() {
		return grade;
	}
	
	public String name() {
		return name;
	}
	

}

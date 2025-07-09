package com.expensetrackerweb.expensetracker.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String title;
	private long amount;
	private String category;
	private Date date;
	
	public Expense(String title,long amount,String category,Date date) {
		this.title=title;
		this.amount=amount;
		this.category=category;
		this.date = date;
	}	
	public Expense(long ID) {
		this.ID=ID;
	}
	public Expense(){
		
	}
	
	public void setId(long ID) {
		this.ID=ID;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAmount(long amount) {
		this.amount=amount;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	
	public long getId() {
		return ID;
	}
	public String getTitle() {
		return title;
	}
	public long getAmount() {
		return amount;
	}
	public String getCategory() {
		return category;
	}
	public Date getDate() {
		return date;
	}
	
	public String Title() {
		return title;
	}
	public long Amount() {
		return amount;
	}
	public String Category() {
		return category;
	}
	public Date Date() {
		return date;
	}
}

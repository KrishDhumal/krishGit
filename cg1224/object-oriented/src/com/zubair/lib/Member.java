package com.zubair.lib;

public class Member {
	private String name;
	private Book bk;
	
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBook(Book b) {
		this.bk = b;
	}
	
	public void status() {
		if(bk == null)
			System.out.println("No book is issue by " + name);
		else
			System.out.println(name + " had issued " + bk.getTitle());
	}
}

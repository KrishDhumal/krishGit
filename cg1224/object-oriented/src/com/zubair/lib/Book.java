package com.zubair.lib;

public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}
	
	public void issueBook(Member m) {
		this.mbr = m;
		m.setBook(this);
		System.out.println("Book issued");
	}
	
	public void returnBook(Member m) {
		mbr = null;
		m.setBook(null);
		System.out.println("Book returned");
	}
}





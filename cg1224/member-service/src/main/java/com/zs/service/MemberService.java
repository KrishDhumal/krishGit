package com.zs.service;

import java.util.List;

import com.zs.entity.Member;

public interface MemberService {

	void add(Member m);
	
	Member findById(int mid);
	
	List<Member> list();
	
	Member validate(String email, String password);
}

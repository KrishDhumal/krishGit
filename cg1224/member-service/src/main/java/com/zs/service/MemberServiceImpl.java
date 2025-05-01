package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.Member;
import com.zs.repo.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repo;
	
	@Override
	public void add(Member m) {
		repo.save(m);
	}

	@Override
	public Member findById(int mid) {
		return repo.findById(mid).orElseThrow(() -> 
			new InvalidMemberException("Member not found with Id: " + mid));
	}

	@Override
	public List<Member> list() {
		return repo.findAll();
	}

	@Override
	public Member validate(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}
}

package com.zs.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.zs.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findByEmailAndPassword(String email, String password);
}

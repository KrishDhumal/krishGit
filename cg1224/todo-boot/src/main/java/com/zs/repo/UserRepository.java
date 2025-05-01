package com.zs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zs.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

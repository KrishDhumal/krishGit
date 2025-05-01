package com.zs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zs.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	@Query("FROM Todo WHERE user.userid=:userid")
	List<Todo> findAllByUser(int userid);
}

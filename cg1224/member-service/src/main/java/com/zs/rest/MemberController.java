package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.Member;
import com.zs.service.InvalidMemberException;
import com.zs.service.MemberService;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public void add(@RequestBody Member m) {
		service.add(m);
	}
	
	@GetMapping(value = "/{mid}", produces = "application/json")
	public Member get(@PathVariable int mid) {
		return service.findById(mid);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Member> list() {
		return service.list();
	}
	
	@GetMapping(value = "/login", produces = "application/json")
	public Member validate(@RequestParam String email, @RequestParam String password) {
		return service.validate(email, password);
	}

	@ExceptionHandler(InvalidMemberException.class)
	public ResponseEntity<Object> handleInvalidMemberException(InvalidMemberException ex) {
		return new ResponseEntity<>( ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}

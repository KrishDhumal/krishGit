package com.zs.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zs.dao.EmpDeptDao;
import com.zs.entity.Department;
import com.zs.entity.Employee;

public class TestEmpDeptDao {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testGetDept() {
		Department d = dao.getDept(10);
		System.out.println(d);
		
		List<Employee> emps = d.getEmps();
		for(Employee e : emps)
			System.out.println(e);
	}
	
	@Test
	public void testDelDept() {
		dao.delDept(30);
	}
}

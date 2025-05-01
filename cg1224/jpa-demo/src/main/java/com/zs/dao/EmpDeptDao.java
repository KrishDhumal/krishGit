package com.zs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zs.entity.Department;
import com.zs.entity.Employee;

public class EmpDeptDao {

	private EntityManagerFactory factory;

	public EmpDeptDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public boolean addDept(Department dept) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		try {
			em.persist(dept);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean addEmp(Employee emp, int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		try {
			Department d = em.find(Department.class, deptNo);
			emp.setDept(d);
			em.persist(emp);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	public Department getDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Department.class, deptNo);
	}

	public Employee getEmp(int empNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Employee.class, empNo);
	}

	public List<Department> allDept() {
		EntityManager em = factory.createEntityManager();
		return em.createQuery("FROM Department").getResultList();
	}

	public List<Employee> allEmp() {
		EntityManager em = factory.createEntityManager();
		return em.createQuery("FROM Employee").getResultList();
	}

	public boolean delDept(int deptNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		try {
			Department d = em.find(Department.class, deptNo);
			em.remove(d);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean delEmp(int empNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		try {
			Employee e = em.find(Employee.class, empNo);
			em.remove(e);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}
}

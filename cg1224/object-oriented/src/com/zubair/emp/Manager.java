package com.zubair.emp;

public class Manager extends Employee {
	private double incentives;

	public Manager() {
	}

	public Manager(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives: " + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}
}

package cn.itcast.domain;

import java.time.LocalDate;

public class Employee1 extends Person {
	private double salary;
	private LocalDate hireday;
	
	public Employee1(String n,double s,int year,int month,int day) {
		super(n);
		this.salary = s;
		hireday = LocalDate.of(year, month, day);
	}

	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireday() {
		return hireday;
	}
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary+=raise;
	}
}

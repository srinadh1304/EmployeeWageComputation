package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PRESENT=1;
	public static void main(String[] args) {
		System.out.println("****** Welcome to Employee Wage Computation ******");
		int presentOrAbsent=(int)Math.floor((Math.random()*10)%2);
		if(presentOrAbsent==PRESENT)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is abscent");
		}
	}
}

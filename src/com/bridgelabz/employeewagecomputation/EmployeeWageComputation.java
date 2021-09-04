package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PRESENT=1;
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	public static void main(String[] args) {
		System.out.println("****** Welcome to Employee Wage Computation ******");
		int presentOrAbsent=(int)Math.floor((Math.random()*10)%2);
		int employeeHours=0;
		int employeeWage=0;
		if(presentOrAbsent==PRESENT)
		{
			employeeHours=8;
		}
		else
		{
			employeeHours=0;
		}
		employeeWage=employeeHours*WAGE_PER_HOUR;
		System.out.println("Employee wage : "+employeeWage);
	}
}

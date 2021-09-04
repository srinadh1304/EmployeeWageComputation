package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PART_TIME=1;
	static final int FULL_TIME=2;
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	public static void main(String[] args) {
		System.out.println("****** Welcome to Employee Wage Computation ******");
		int employeeCheck=(int)Math.floor((Math.random()*10)%3);
		int employeeHours=0;
		int employeeWage=0;
		switch(employeeCheck)
		{
		case FULL_TIME:
			employeeHours=8;
			break;
		case PART_TIME:
			employeeHours=4;
			break;
		default:
			employeeHours=0;
			break;
		}
		employeeWage=employeeHours*WAGE_PER_HOUR;
		System.out.println("Employee wage : "+employeeWage);
	}
}

package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PART_TIME=1;
	static final int FULL_TIME=2;
	static final int WAGE_PER_HOUR=20;
	static final int FULL_WORKING_HOURS=100;
	static final int TOTAL_WORKING_DAYS=20;
	public static void main(String[] args) {
		int employeeHours=0,employeeWage=0,working_days=0;
		System.out.println("****** Welcome to Employee Wage Computation ******");
		while(employeeHours<FULL_WORKING_HOURS && working_days<TOTAL_WORKING_DAYS)
		{
			int employeeCheck=(int)Math.floor((Math.random()*10)%3);
			switch(employeeCheck)
			{
			case FULL_TIME:
				employeeHours+=8;
				break;
			case PART_TIME:
				employeeHours+=4;
				break;
			default:
				break;
			}
			working_days++;


		}			
		employeeWage=employeeHours*WAGE_PER_HOUR;
		System.out.println("Employee wage for a  month : "+employeeWage);
	}
}

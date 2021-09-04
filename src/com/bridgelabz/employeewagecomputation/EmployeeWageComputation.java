package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PART_TIME=1;
	static final int FULL_TIME=2;
	static int employeeWageCalculator(String company,int employeeWagePerHour,int noOfWorkingDays,int maximumHoursPerMonth) {
		int employeeHours=0,employeeWage=0,working_days=0;
		
		while(employeeHours<maximumHoursPerMonth && working_days<noOfWorkingDays)
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
			System.out.println("Day#: "+working_days+" Emp Hr: "+employeeHours);

		}			
		employeeWage=employeeHours*employeeWagePerHour;
		System.out.println("Total Employee wage for company: "+company+" is "+employeeWage);
		return employeeWage;
	}
	public static void main(String[] args) {
		System.out.println("****** Welcome to Employee Wage Computation ******");
		employeeWageCalculator("Apple", 20, 2, 10);
		employeeWageCalculator("Reliance", 10, 4, 20);
		
	}
}

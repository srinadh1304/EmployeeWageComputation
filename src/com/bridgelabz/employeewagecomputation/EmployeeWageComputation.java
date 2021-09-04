package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PART_TIME=1;
	static final int FULL_TIME=2;
	private  String COMPANY;
	private  int EMPLOYEE_RATE_PER_HOUR;
	private  int NUMBER_OF_WORKING_HOURS;
	private int MAXIMUM_HOURS_PER_MONTH ;
	private int TOTAL_WAGE;
	EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.COMPANY = company;
		this.EMPLOYEE_RATE_PER_HOUR = empRatePerHour;
		this.NUMBER_OF_WORKING_HOURS = numOfWorkingDays;
		this.MAXIMUM_HOURS_PER_MONTH = maxHoursInMonth;
	}
	public void employeeWageCalculator() {
		int totalEmployeeHours=0,working_days=0;

		while(totalEmployeeHours<MAXIMUM_HOURS_PER_MONTH && working_days<NUMBER_OF_WORKING_HOURS)
		{
			int employeeCheck=(int)Math.floor((Math.random()*10)%3);
			switch(employeeCheck)
			{
			case FULL_TIME:
				totalEmployeeHours+=8;
				break;
			case PART_TIME:
				totalEmployeeHours+=4;
				break;
			default:
				break;
			}
			working_days++;
			System.out.println("Day#: "+working_days+" Emp Hr: "+totalEmployeeHours);

		}			
		TOTAL_WAGE = totalEmployeeHours *EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Total Employee wage for company: "+COMPANY+" is "+TOTAL_WAGE);

	}
	public static void main(String[] args) {
		System.out.println("****** Welcome to Employee Wage Computation ******");
		EmployeeWageComputation apple = new EmployeeWageComputation("APPLE",20, 12, 50);
		apple.employeeWageCalculator();
		EmployeeWageComputation Reliance = new EmployeeWageComputation("Reliance",23, 6, 60);
		Reliance.employeeWageCalculator();

	}
}

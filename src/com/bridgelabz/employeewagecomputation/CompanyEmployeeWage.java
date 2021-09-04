package com.bridgelabz.employeewagecomputation;

public class CompanyEmployeeWage {
	private  String COMPANY;
	public  int EMPLOYEE_RATE_PER_HOUR;
	public  int NUMBER_OF_WORKING_HOURS;
	public int MAXIMUM_HOURS_PER_MONTH ;
	private int TOTAL_WAGE;
	CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.COMPANY = company;
		this.EMPLOYEE_RATE_PER_HOUR = empRatePerHour;
		this.NUMBER_OF_WORKING_HOURS = numOfWorkingDays;
		this.MAXIMUM_HOURS_PER_MONTH = maxHoursInMonth;
	}
	public void setTotalEmployeeWage(int totalEmployeeWage) {
		this.TOTAL_WAGE=totalEmployeeWage;
	}
	@Override
	public String toString() {
		return "The total wage of employee in "+COMPANY+" is : "+ TOTAL_WAGE;
	}
}

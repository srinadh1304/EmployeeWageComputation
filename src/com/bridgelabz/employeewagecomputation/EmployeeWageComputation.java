package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	static final int PART_TIME=1;
	static final int FULL_TIME=2;
	
	private int noOfCompanies=0;
	private CompanyEmployeeWage []CompanyEmployeeWageArray;
	public EmployeeWageComputation()
	{
		CompanyEmployeeWageArray=new CompanyEmployeeWage[5];
	}
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		CompanyEmployeeWageArray[noOfCompanies] = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
		noOfCompanies++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i< noOfCompanies; i++) {
			CompanyEmployeeWageArray[i].setTotalEmployeeWage(this.computeEmpWage(CompanyEmployeeWageArray[i]));
			System.out.println(CompanyEmployeeWageArray[i]);
		}
	}
	public  int  computeEmpWage(CompanyEmployeeWage companyEmpWage) {

		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		//computation
		while(totalEmpHrs <= companyEmpWage.MAXIMUM_HOURS_PER_MONTH && totalWorkingDays < companyEmpWage.NUMBER_OF_WORKING_HOURS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
				case PART_TIME : 
					empHrs = 4;
					break;
				case FULL_TIME :
					empHrs = 8;
					break;
				default :
					empHrs = 0;
			}
		
			totalEmpHrs += empHrs;
			System.out.println("Days#: "+totalWorkingDays+"     Emp Hrs: "+ empHrs);
		}
		return totalEmpHrs *companyEmpWage.EMPLOYEE_RATE_PER_HOUR;
		
	}
	
	
	public static void main(String[] args) {
		EmployeeWageComputation employeeObject = new EmployeeWageComputation();
		employeeObject.addCompanyEmpWage("Dmart",20, 5, 50);
		employeeObject.addCompanyEmpWage("Reliance",22, 6, 60);
		
		employeeObject.computeEmpWage();
		

		
	}
	
}

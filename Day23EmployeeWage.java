interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int numOfWorkingDays, int empRatePerHour, int maxHoursPerMonth);
	public void computeEmpWage();
}

class CompanyEmpWage {
	public final String company;
	public int numOfWorkingDays;
	public final int empRatePerHour;
	public final int maxHoursPerMonth;
	public int totalEmployeeWage;

	public CompanyEmpWage(String company, int numOfWorkingDays, int empRatePerHour, int maxHoursPerMonth) {
		this.company = company;
		this.numOfWorkingDays = numOfWorkingDays;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}

	public String toString() {
		return "Total Employee wage for " + company + ": " + totalEmployeeWage;
	}
}

public class Day23EmployeeWage implements IComputeEmpWage {
	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	private int numOfCompanies = 0;
	public CompanyEmpWage[] companyEmpWageArray;

	public Day23EmployeeWage() {
		companyEmpWageArray = new CompanyEmpWage[4];
	}

		public void addCompanyEmpWage(String company, int numOfWorkingDays, int empRatePerHour, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompanies] = new CompanyEmpWage(company, numOfWorkingDays, empRatePerHour, maxHoursPerMonth);
		numOfCompanies++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			companyEmpWageArray[i].setTotalEmpWage(calculateEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
		// Variables
		int empHours;
		int totalEmployeeWage;
		int day = 0;
		int totalEmpHours = 0;

		// Computation
		while (totalEmpHours < companyEmpWage.maxHoursPerMonth && day < companyEmpWage.numOfWorkingDays) {
			int randomCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (randomCheck) {
			case IS_FULL_TIME:
				empHours = 8;
				break;
			case IS_PART_TIME:
				empHours = 4;
				break;
			default:
				empHours = 0;
			}
			totalEmpHours += empHours;
			day++;
		}
		totalEmployeeWage = totalEmpHours * companyEmpWage.empRatePerHour;
		return totalEmployeeWage;
	}

	public static void main(String[] args) {
		Day23EmployeeWage empWageBuilder = new Day23EmployeeWage();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 20, 100);
		empWageBuilder.addCompanyEmpWage("Jio", 25, 30, 80);
		empWageBuilder.computeEmpWage();
	}
}


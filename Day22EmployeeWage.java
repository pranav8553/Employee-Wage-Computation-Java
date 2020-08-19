public class Day22EmployeeWage {
	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static final int MAXIMUM_WORKING_HOURS = 100;

	public static void calculateEmpWage(String company, int numOfWorkingDays,int empRatePerHour, int maxHoursPerMonth) {
		// Variables
		int empHours;
		int employeeWage;
		int day = 0;
		int totalEmpHours = 0;

		// Computation
		while (totalEmpHours < maxHoursPerMonth && day < numOfWorkingDays) {
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
		employeeWage = totalEmpHours * empRatePerHour;
		System.out.println("Total Employee wage for " + company + ": "+ employeeWage);
	}

	public static void main(String[] args) {
		calculateEmpWage("DMart", 20, 20, 100);
		calculateEmpWage("Reliance", 15, 15, 90);
		calculateEmpWage("Vodafone", 20, 25, 120);
	}
}


public class Day23EmployeeWage {
	// Constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	private final String company;
	private final int numOfWorkingDays;
	private final int empRatePerHour;
	private final int maxHoursPerMonth;

	public Day23EmployeeWage(String company, int numOfWorkingDays, int empRatePerHour, int maxHoursPerMonth) {
		this.company = company;
		this.numOfWorkingDays = numOfWorkingDays;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public int calculateEmpWage() {
		// Variables
		int empHours;
		int totalEmployeeWage;
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
		totalEmployeeWage = totalEmpHours * empRatePerHour;
		return totalEmployeeWage;
	}

	public static void main(String[] args) {
		Day23EmployeeWage dMart = new Day23EmployeeWage("DMart", 20, 20, 100);
		Day23EmployeeWage jio = new Day23EmployeeWage("Jio", 25, 30, 80);
		System.out.println("Total Employee wage for "+dMart.company+": "+dMart.calculateEmpWage());
		System.out.println("Total Employee wage for "+jio.company+": "+jio.calculateEmpWage());
	}
}


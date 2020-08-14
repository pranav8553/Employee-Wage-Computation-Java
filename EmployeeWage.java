public class EmployeeWage{
	//Constants
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int WORKING_DAYS_PER_MONTH=20;

	public static void main(String[] args){
		//Variables
		int empHours;
		int employeeWage;
		int day;
		int totalHours=0;
		int totalEmpWage=0;

		//Computation
		for (day=1; day <= WORKING_DAYS_PER_MONTH; day++) {
			int randomCheck=(int)Math.floor(Math.random()*10)%3;
			switch (randomCheck) {
				case IS_FULL_TIME:
					empHours=8;
					break;
				case IS_PART_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
			employeeWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Wage for day"+day+": "+employeeWage);
			totalEmpWage += employeeWage;
		}
		System.out.println("Total Employee wage: "+totalEmpWage);
	}
}



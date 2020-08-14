public class EmployeeWage{
	//Constants
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static void main(String[] args){
		//Variables
		int empHours;
		int employeeWage;
		int randomCheck=(int)Math.floor(Math.random()*10)%3;
		//Computation
		if (randomCheck == IS_FULL_TIME){
			empHours=8;
		}
		else if (randomCheck == IS_PART_TIME){
			empHours=4;
		}
		else
			empHours=0;
		employeeWage=empHours * EMP_RATE_PER_HOUR;
		System.out.println("Employee wage: "+employeeWage);
	}
}



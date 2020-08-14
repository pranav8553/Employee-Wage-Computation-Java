public class EmployeeWage{
	public static void main(String[] args){
		int isPresent=1;
		int randomCheck=(int)Math.floor(Math.random()*10)%2;
		if (randomCheck == isPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}



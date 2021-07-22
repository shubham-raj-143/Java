package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek=3;
		
		switch(dayOfWeek) {
		case 1:                           //Merging  switch ....
		case 2:
			System.out.println("Its a holiday.enjoy");
			
			break;
		
		case 3:
			System.out.println("anuj's birthday");
			break;
		
		case 4:
			System.out.println("priya wedding anniversary");
			break;
		
		case 5:
			System.out.println("salary day");
			break;
		
		case 6:
			System.out.println("Independance day");
			break;
		
		case 7:
			System.out.println("weekend ...watch movies!!");
			break;
			
		default:
			System.out.println("Invalid Input!!");
			break;
		}

	}

}

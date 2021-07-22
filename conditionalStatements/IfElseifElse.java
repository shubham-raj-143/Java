package conditionalStatements;

public class IfElseifElse {
	public static void main(String[] args) {
		int num=22;
		if(num<=10) {
			System.out.println("Number is less than 10");
		}
		else if(num>10 && num<=20) {
			System.out.println("no is less than 20 but greater than 10");
		}
		else if (num>20 && num<=30) {
			System.out.println("no. is greater than 20 but less than 30");
		}
		else {
			System.out.println("no.is greater than 30");
		}
	}

}

package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {           //find the greatest among three numbers!!!
		// TODO Auto-generated method stub
		int a=32,b=33,c=100;
		int result=0;
		result=a>b?a>c?a:c:b>c?b:c;
		System.out.println("greatest no is :"+result);

	}

}

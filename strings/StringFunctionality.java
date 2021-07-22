package strings;

public class StringFunctionality {

	public static void main(String[] args) {
		String name1 = "shubham raj singh";
		String name2="    shubham   ";
		String name3=new String("shubham raj singh");
		System.out.println(name1.charAt(2));
		System.out.println(name1.length());
		System.out.println(name1.substring(5));
		System.out.println(name1.substring(6, 10));
		System.out.println(name1.contains("shubha"));
		System.out.println(name1.equals(name3));
		System.out.println(name1.isEmpty());
		System.out.println(name2.concat(" raj singh"));
		System.out.println(name2+" raj singh");
		System.out.println(name1.replace('a', 'c'));
		System.out.println(name3.replace('a', 'd'));
		System.out.println(name1.indexOf('z')); //returns -1
		System.out.println(name1.indexOf('a'));  //returns 5...first time a will come in 5th position...
		System.out.println(name1.toUpperCase());
		System.out.println(name2.trim());
		
		
		
		String animals="cat,mouse,rat,rabbit,zebra,giraffe,elephant,lion,chimpanzee";
		String allanimals[]=animals.split(",");
		for(String animal:allanimals) {
			System.out.print(animal+" ");
		}
	}

}

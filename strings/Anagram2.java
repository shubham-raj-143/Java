package strings;
//for all 256 characters...

public class Anagram2 {
	public static void main(String[] args) {
		 String a ="aad";
		 String b ="aad";
		 boolean isAnagram=true;
		int al[]=new int[256];
		//int bl[]=new int[256];
		for(char c:a.toCharArray()) {      //for each loop
			int index=(int) c;
			al[index]++;
			}
		for(char c:b.toCharArray()) {      //for each loop
			int index=(int) c;
			//bl[index]++;
			al[index]--;
			}
	//for(int i=0;i<256;i++) {
	//	if(al[i]!=bl[i]) {
	//		isAnagram=false;
	//		break;
	//	}
	//}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}

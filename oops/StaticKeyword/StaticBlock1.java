package oops.StaticKeyword;
// Jab tak Hamlog Main Function Tk pahuche tb tk Kuch Kuch cheeze initialize hoo jaaye
// Ya Kuch Kuch cheeze execute hoo jaaye

// First all static block will be initialized sequentially then Main will be executed.
public class StaticBlock1 {
	static {
		System.out.println("in Block 1");
	}
	

	public static void main(String[] args) {
		System.out.println("in Main Block");

	}
	static {
		System.out.println("in Block 2");
	}

}

package oops.Singleton;

public class MainClass {

	public static void main(String[] args) {
		//Now how many objects we make all will return same object[obj1, obj2... will return same object]
		AppConfig obj1 = AppConfig.getIntance();
		AppConfig obj2 = AppConfig.getIntance();
		AppConfig obj3 = AppConfig.getIntance();
		AppConfig obj4 = AppConfig.getIntance();
		

	}

}

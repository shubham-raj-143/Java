package oops;
class Vehicle{
	int wheels;
	int headLights;
	Vehicle(int wheels){
		
		this.wheels=wheels;
		headLights=2;
	}
}

public class MyConstructors {
	MyConstructors(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		MyConstructors obj=new MyConstructors();  //calling constructor
		Vehicle car=new Vehicle(4);                //calling class
		Vehicle car2=new Vehicle(2);
		System.out.println(car.wheels);
		System.out.println(car2.wheels);

	}

}

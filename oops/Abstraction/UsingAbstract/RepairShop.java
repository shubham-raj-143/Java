package oops.Abstraction.UsingAbstract;

public class RepairShop {
	//We made these 2 function as static , as we are calling them from MAIN function which is static
//	public static void repairCar(WagnoR car)
//	{
//		System.out.println("Car is repaired");
//	}
//	public static void repairCar(Audi car)
//	{
//		System.out.println("Car is repaired");
//	}
	
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}

	public static void main(String[] args) {
		WagnoR wagnoR = new WagnoR();
		Audi audi = new Audi();
		repairCar(wagnoR);
		repairCar(audi);
		
		// Now we cannot make car class abject as it is abstract now and there is no need also
		// as there is no meaning for creating its object as we have to work with its children only.
//		Car car = new Car();
		
		

	}

}

package oops;

class Cat { // class is just a dummy and does not belong to memory
	boolean hasFur; // so if we update cat1.legs=3 and cat2.legs=4 then that does not mean that the
					// state legs is updated in class ...
	String color, breed; // instead it gets updated in object....as they are given separate memory not
							// class...
	int legs, eyes;

	public void walk() {
		System.out.println("Cat is walking");
	}

	public void eat() {
		System.out.println("Cat is eating");
	}

	public void description() {
		System.out.println("my cat has " + legs + " legs and " + eyes + " eyes");
	}
}

class Dog {
	String breed, name;

	public void jump() {
		System.out.println("my dog " + name + " jumped");
	}

	public void description() {
		System.out.println("my dog " + name + " breed is " + breed);
	}

}

public class MainClass {

	public static void main(String[] args) {
		Cat cat1 = new Cat(); // each objects of a class have separate memory....
		Cat cat2 = new Cat(); // so if we update cat1.legs=3 then 3 is assigned to cat1 legs
		cat1.legs = 3; // and if we update cat2.legs=4 then 4 is assigned to cat2 legs.....
		cat1.eyes = 4;
		cat2.legs = 2;
		cat2.eyes = 5;
		cat1.description();
		cat2.description();

		Dog husky = new Dog();
		Dog poodle = new Dog();
		husky.breed = "Husky";
		husky.name = "Tiger";
		poodle.breed = "Poodle";
		poodle.name = "tuffy";
		husky.jump();
		husky.description();

	}

}

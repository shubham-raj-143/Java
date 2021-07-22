package methods;
//java is pass by value
// When Objects attributes are passed then it becomes call by reference(it can change the value)
public class PassByValue {

	public static void main(String[] args) {
//		int c=12;
//		int d=31;
//		swap(c,d);
//		System.out.println(c+" "+d);    //will not swap ...shows java is call by value.
		Dog c= new Dog();
		c.legs=4;
		Dog d=new Dog();
		d.legs=5;
		swap(c,d);
		System.out.println(c.legs+" "+d.legs);
		
		Dog a =new Dog();
		a.legs=4;
		changeDog(a);
		System.out.println(a.legs);

	}
	static void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
	}
	static void swap(Dog a,Dog b) {
		int temp=a.legs;
		a.legs=b.legs;
		b.legs =temp;
	}
	static void changeDog(Dog dog) {
		dog.legs=7;
	}

}
class Dog{
	int legs;
}


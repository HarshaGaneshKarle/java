package Day_5;
class Animal {
	void sleep() {
		System.out.println("Sleeping");
	}
}
	class Dog extends Animal{
		void bark() {
			System.out.println("Dog is Barking");
		}
	}
public class demo_1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.sleep();
		d.bark();
	}
}

package Day_5;
class Fruits{
	void benifits() {
		System.out.println("Healthy");
	}
}
class Mango extends Fruits{
	void price() {
		System.out.println("2 saow rupee kilo");
	}
}
class Apple extends Fruits{
	void colour() {
		System.out.println("Red");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("sweet");
	}
}

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		Mango m=new Mango();
		Banana b=new Banana();
		a.colour();
		m.price();
		b.taste();
		m.benifits();
	}

}

package Day_5;
class Bike{
	void speed() {
		System.out.println("250 kmph");
	}
}
class bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends bmw{
	void price() {
		System.out.println("27 Lakhs");
	}
}
public class demo_2 {
	public static void main(String[] args) {
	Model m=new Model();
	m.speed();
	m.rev();
	m.price();
}
}
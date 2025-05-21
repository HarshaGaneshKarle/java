package Day_5;
interface I1{
	abstract void add();
	void sub();
}
public class demo8 implements I1{
	public void add() {
		System.out.println("HI");
	}
	public void sub() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		demo8 d8=new demo8();
		d8.add();
		d8.sub();
	}

}

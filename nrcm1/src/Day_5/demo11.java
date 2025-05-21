package Day_5;
class sam1{
	public sam1() {
		System.out.println("Good Evening");
	}
	int x=90;
	void print() {
		System.out.println("Hello");
	}
}
public class demo11 extends sam1{
	public demo11() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 d11=new demo11();
		d11.show();
	}

}

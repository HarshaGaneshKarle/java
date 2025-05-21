package Day_6;
public class demo4{
	void show() {
		System.out.println("Hey");
	}
	class test2{
		void print() {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		demo4 d4=new demo4();
		d4.show();
		demo4.test2 t=new demo4().new test2();
		t.print();
	}
}
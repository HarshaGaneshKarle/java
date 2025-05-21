package Day_5;
class test2{
	void add() {
		System.out.println("hi");
	}
}
public class demo7 extends test2 {
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo7 d7=new demo7();
		d7.add();
		d7.add();
		
	}

}

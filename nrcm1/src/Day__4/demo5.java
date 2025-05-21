package Day__4;

public class demo5 {
	int a=90;
	int b=70;
	public demo5(int x,int y) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		demo5 d5=new demo5(54,87);
		d5.add();
	}

}

package Day_5;

public class demo5 {
	void show() {
		System.out.println("Good Morning");
	}
	void show(int a ,int b) {
		System.out.println(a+b);
	}
	void show(double c,double d) {
		System.out.println(c-d);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}
public static void main(String[] args) {
	demo5 d5=new demo5();
	d5.show();
	d5.show(8,9);
	d5.show(9990,8765);
	d5.show("true"," detective");
}

}

package Day_8;

public class demo1 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		demo1 d1=new demo1();
		Thread t2=new Thread(d1);
		System.out.println("Hello");
		t2.start();
	}
}

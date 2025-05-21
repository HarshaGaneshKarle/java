package Day_8;

public class Demo7 implements Runnable{
	public void run() {
		System.out.println("HI");
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Demo7());
		t1.start();
	}

}

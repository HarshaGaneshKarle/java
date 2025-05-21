package Day_8;

public class Demo6 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Demo6 d6=new Demo6();
		d6.start();
		
	}

}

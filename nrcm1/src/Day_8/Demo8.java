package Day_8;

public class Demo8 extends Thread{
	String s;
	public Demo8(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s+" is Daemon Thread");
		}
		else {
			System.out.println(s+" is user Thread");
		}
	}
	public static void main(String[] args) {
		Demo8 t1=new Demo8("Thread1");
		Demo8 t2=new Demo8("Thread2");
		Demo8 t3=new Demo8("Thread3");
		t1.setDaemon(true);//set user thread1 to daemon
		t1.start();//starting thread1
		t2.start();//starting thread2
		t3.setDaemon(false);//set user thread1 to daemon
		t3.start();//starting thread3
	}
}

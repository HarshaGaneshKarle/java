package Day_8;
class Test1 extends Thread {
 public void run() {
     System.out.println("How many pounds do you need");
 }
}
class Test02 extends Test1 {
 public void run() {
     System.out.println("25 pounds whether it's blue, yellow, pink... whatever.");
 }
}
class Test03 implements Runnable {
 public void run() {
     System.out.println("2 Million Dollars");
 }
}
class Test4 extends Test03 {
 public void run() {
     System.out.println("Deal");
 }
}
public class Demo4 {
 public static void main(String[] args) {
     Test1 t1 = new Test1();
     Test02 t2 = new Test02();
     Test03 t3 = new Test03();
     Test4 t4 = new Test4();

     t1.start();
     t2.start();
     Thread t5 = new Thread(t3);
     t5.start();

     Thread t6 = new Thread(t4);
     t6.start();
 }
}

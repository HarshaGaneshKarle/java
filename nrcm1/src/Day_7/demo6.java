package Day_7;

public class demo6 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        demo6 d1 = new demo6();
        d1.start();
        System.out.println("Hii");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}

package Day__4;

class test5 {
    protected void add() {
        System.out.println("hi");
    }

}
public class demo_8 extends test5 {
    public static void main(String[] args) {
        test5 t3 = new test5();
        t3.add();
    }
}
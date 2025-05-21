package Day_6;

class test1 {
    void show() {
        System.out.println("hi");
    }
}
public class demo3 extends test1 {
    void show() {
        int a = 89;
        System.out.println(a);
        a = 54;
        System.out.println(a);
    }
    public static void main(String[] args) {
        demo3 d3 = new demo3();
        d3.show();
    }
}

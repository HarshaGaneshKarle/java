package day_3;
abstract class TestAbstract {
    abstract void show1();
    static void show2() {
        System.out.println("This is java class");
    }
    static void show3() {
        System.out.println("Abstract class");
    }
    int a = 8;
    void show4() {
        System.out.println(a * a);
    }
    void show5() {
        System.out.println(a * a);
    }
}
class demo11 extends TestAbstract {
    public void show1() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        demo11 d = new demo11();
        d.show1();
        d.show4();
        d.show5();
        TestAbstract.show2();
        TestAbstract.show3();
    }
}

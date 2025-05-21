package day_3;

abstract class test {
    abstract void add();
    abstract void sub();
    int a = 80, b = 90;
    void ins() {
        System.out.println(a / b);
        System.out.println(a % b);
    }
    static void mul() {
        int h = 4, b = 9;
        System.out.println(h * b);
    }
}
class demo10 extends test {
    public void add() {
        System.out.println(8 + 9);
    }
    public void sub() {
        System.out.println(5 - 3);
    }
    public static void main(String[] args) {
        demo10 d = new demo10();
        d.add();
        d.sub();
        d.ins();
        test.mul();
    }
}

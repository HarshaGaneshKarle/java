package Day_5;
interface I5 {
    void add();
}
interface I6 {
    void sub();
}
interface I8 extends I5, I6 {
    void mul();
}
class demo10 implements I8 {
    public void add() {
        System.out.println("hiii");
    }
    public void sub() {
        System.out.println("hellooo");
    }
    public void mul() {
        System.out.println("partyyyy");
    }
   
    public static void main(String[] args) {
        demo10 obj = new demo10();
        obj.add();
        obj.sub();
        obj.mul();
    }
}

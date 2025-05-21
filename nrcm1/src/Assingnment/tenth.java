package Assingnment;
interface UsainBoult {
 void run();
}
interface JavierSotomayor {
 void jump();
}
interface MichaelPhelps {
 void swim();
}
interface Greatest extends UsainBoult,JavierSotomayor,MichaelPhelps{
 void compete();
}
class Sports implements Greatest {
 public void run() {
     System.out.println("Athlete running");
 }
 public void jump() {
     System.out.println("Athlete jumping");
 }
 public void swim() {
     System.out.println("Athlete swimming");
 }

 public void compete() {
     System.out.println("Athlete competing in triathlon");
 }
}
public class tenth {
 public static void main(String[] args) {
     Sports a=new Sports();
     a.run();
     a.jump();
     a.swim();
     a.compete();
 }
}

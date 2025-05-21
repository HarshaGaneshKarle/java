package Assingnment;
interface Drivable {
 void drive();
}
class Vehicl {
 void startEngine() {
     System.out.println("Engine started");
 }
}
class ElectricSystem {
 void checkBattery() {
     System.out.println("Battery is good");
 }
}
class CarSystem extends Vehicl implements Drivable {
 public void drive() {
     System.out.println("Car is being driven");
 }
}

class BatterySystem extends ElectricSystem {
 void monitorBatteryHealth() {
     System.out.println("Monitoring battery health");
 }
}
public class eighth {
 public static void main(String[] args) {
     CarSystem c=new CarSystem();
     BatterySystem b=new BatterySystem();
     c.startEngine();
     c.drive();
     b.checkBattery();
     b.monitorBatteryHealth();
 }
}


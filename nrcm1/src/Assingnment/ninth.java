package Assingnment;
interface TwoWheeler {
 void showTwoWheeler();
}
interface FourWheeler {
 void showFourWheeler();
}
interface HeavyVehicle {
 void showHeavyVehicle();
}
class VehicleDetails implements TwoWheeler,FourWheeler,HeavyVehicle {
 public void showTwoWheeler() {
     System.out.println("Two-Wheelers:Bike,Scooter,Electric Bike");
 }

 public void showFourWheeler() {
     System.out.println("Four-Wheelers:Car,SUV,Jeep");
 }

 public void showHeavyVehicle() {
     System.out.println("Heavy Vehicles:Truck,Bus,Trailer");
 }

 public void extraVehicles() {
     System.out.println("Special Vehicles:Ambulance,Fire Truck,Police Van");
 }
}
interface TransportAuthority {
 void showAuthorityName();
}
class TransportSystem extends VehicleDetails implements TransportAuthority {
 public void systemMenu() {
     System.out.println("VEHICLE REGISTRY MENU");
 }
 public void showAuthorityName() {
     System.out.println("Transport Authority: NATIONAL VEHICLE BOARD");
 }
}
public class ninth {
 public static void main(String[] args) {
     TransportSystem s=new TransportSystem();
     s.showAuthorityName();
     s.systemMenu();
     s.showTwoWheeler();
     s.showFourWheeler();
     s.showHeavyVehicle();
     s.extraVehicles();
 }
}
package Assingnment;
interface Electric {
    void charge();
}
interface GPS {
    void navigate();
}

class Vehicle {
    void fuelUp() {
        System.out.println("Vehicle refueled with petrol");
    }
}
class Tesla extends Vehicle implements Electric, GPS {
    public void charge() {
        System.out.println("Tesla charging with charger");
    }

    public void navigate() {
        System.out.println("Tesla navigating using GPS");
    }
}
public class fourth {
    public static void main(String[] args) {
        Tesla t=new Tesla();
        t.fuelUp();       
        t.charge(); 
        t.navigate();
    }
}


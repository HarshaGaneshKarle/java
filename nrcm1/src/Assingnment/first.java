package Assingnment;
interface BasicControl {
    void turnOn();
    void turnOff();
}
interface Status {
    void checkStatus();
}
interface Device extends BasicControl,Status{
    void updateFirmware();
}
class first implements Device {
    public void turnOn() {
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
    public void checkStatus() {
        System.out.println("Light is working properly");
    }
    public void updateFirmware() {
        System.out.println("Firmware updated successfully");
    }
    public static void main(String[] args) {
        first l=new first();
        l.turnOn();
        l.checkStatus();
        l.updateFirmware();
        l.turnOff();
    }
}

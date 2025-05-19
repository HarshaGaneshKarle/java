package Assingnment;
interface Call {
    void makeCall();
}
interface Messaging {
    void sendMessage();
}

class phone implements Call,Messaging {
    public void makeCall() {
        System.out.println("Making a phone call");
    }
    public void sendMessage() {
        System.out.println("Sending a text message");
    }
}
class Smartphone extends phone { 
    void videoCall() {
        System.out.println("Making a video call");
    }
}
public class third {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.makeCall();
        sp.sendMessage(); 
        sp.videoCall();    
    }
}

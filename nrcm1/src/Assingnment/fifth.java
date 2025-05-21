package Assingnment;

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Bear extends Animal implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats berries and plants");
    }

    public void eatMeat() {
        System.out.println("Bear eats fish and small animals");
    }
}

class PolarBear extends Bear {
    void habitat() {
        System.out.println("Polar Bear lives in icy regions");
    }
}

public class fifth {
    public static void main(String[] args) {
        PolarBear pb=new PolarBear();
        pb.breathe();     
        pb.eatPlants();
        pb.eatMeat();
        pb.habitat();
    }
}


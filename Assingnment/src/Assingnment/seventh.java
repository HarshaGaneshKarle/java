package Assingnment;
interface Director {
    void direct();
}
interface Actor {
    void act();
}
interface Producer {
    void produce();
}
class FilmDirector implements Director {
    public void direct() {
        System.out.println("Director is directing the movie");
    }
}
class FilmActor implements Actor {
    public void act() {
        System.out.println("Actor is performing a scene");
    }
}
class FilmProducer implements Producer {
    public void produce() {
        System.out.println("Producer is funding the movie");
    }
}
public class seventh {
    public static void main(String[] args) {
        FilmDirector d=new FilmDirector();
        FilmActor a=new FilmActor();
        FilmProducer p=new FilmProducer();
        d.direct();
        a.act();
        p.produce();
    }
}

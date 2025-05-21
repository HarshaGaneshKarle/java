package Assingnment;
interface Passing {
    void passBall();
}
interface Shooting {
    void shootBall();
}
interface Dribbling {
    void dribble();
}
interface Leadership {
    void leadTeam();
}
class BasketballPlayer implements Passing, Shooting, Dribbling {
    public void passBall() {
        System.out.println("Player passes the ball swiftly");
    }
    public void shootBall() {
        System.out.println("Player scores a 3-pointer");
    }
    public void dribble() {
        System.out.println("Player dribbles past the defender");
    }
}
class Player extends BasketballPlayer implements Leadership {
    public void leadTeam() {
        System.out.println("Star player motivates and leads the team");
    }
}
public class sixth {
    public static void main(String[] args) {
        Player p=new Player();
        p.passBall();
        p.shootBall();   
        p.dribble();
        p.leadTeam();
    }
}


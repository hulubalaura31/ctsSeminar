package ro.ase.cts.gr1085.recapitulareAdapter;

import java.util.Random;

public class EnemyRobot {

    Random random = new Random();
    public void smashWithHands(){
        int damage = random.nextInt(10) + 1;
        System.out.println("damage from robot : " + damage);
    }

    public void walksForward(){
        int movement = random.nextInt(15) + 1;
        System.out.println("its walks with " + movement);
    }

    public void reactToHuman(String driverName) {
        System.out.println("The human is "+ driverName);
    }
}

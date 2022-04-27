package ro.ase.cts.gr1085.recapitulareAdapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
    Random random = new Random();
    @Override
    public void fireWeapon() {
        int damage = random.nextInt(10) + 1;
        System.out.println("damage from tank: " + damage);
    }

    @Override
    public void driveForward() {
        int movement = random.nextInt(15) + 1;
        System.out.println("its driving with " + movement);
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println("Drivername is "+ driverName);
    }
}

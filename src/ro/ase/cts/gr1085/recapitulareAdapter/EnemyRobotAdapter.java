package ro.ase.cts.gr1085.recapitulareAdapter;

public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot){
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walksForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}

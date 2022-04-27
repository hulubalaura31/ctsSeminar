package ro.ase.cts.gr1085.recapitulareAdapter;

public class Main {
    public static void main(String[] args){
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        robot.reactToHuman("Paul");
        robot.walksForward();
        robot.smashWithHands();
        System.out.println("----------------");
        tank.fireWeapon();
        tank.driveForward();
        tank.assignDriver("Marie");
        System.out.println("-----------------");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        robotAdapter.assignDriver("aaaa");

    }
}

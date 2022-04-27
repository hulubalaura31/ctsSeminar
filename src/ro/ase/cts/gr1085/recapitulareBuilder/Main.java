package ro.ase.cts.gr1085.recapitulareBuilder;

public class Main {
    public static void main(String[] args){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getHead());

        System.out.println("Robot Leg Type: " + firstRobot.getLegs());
    }

}

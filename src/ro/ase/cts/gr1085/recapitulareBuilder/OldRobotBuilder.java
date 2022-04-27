package ro.ase.cts.gr1085.recapitulareBuilder;

public class OldRobotBuilder implements  RobotBuilder{
    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        this.robot.setRobotHead("test1");
    }

    @Override
    public void buildLegs() {
        this.robot.setRobotLegs("Test2");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}

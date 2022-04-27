package ro.ase.cts.gr1085.recapitulareBuilder;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return  this.robotBuilder.getRobot();
    }

    public void makeRobot(){
        this.robotBuilder.buildHead();
        this.robotBuilder.buildLegs();
    }
}

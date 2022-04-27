package ro.ase.cts.gr1085.recapitulareBuilder;

public class Robot implements  RobotPlan{
    private String head;
    private String legs;
    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public String getLegs() {
        return legs;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }
}

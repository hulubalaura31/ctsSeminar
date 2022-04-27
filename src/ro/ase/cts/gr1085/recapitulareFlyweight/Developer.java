package ro.ase.cts.gr1085.recapitulareFlyweight;

public class Developer implements Employee{
    private final String JOB;
    private String skill;

    public Developer(){
        this.JOB = "bugs";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Dev with skill " + skill + " does " + JOB);
    }
}

package ro.ase.cts.gr1085.recapitulareFlyweight;

import ro.ase.cts.gr1085.recapitulareFlyweight.Employee;

public class Tester implements Employee {
    private final String JOB;

    private String skill;

    public Tester() {
        JOB = "Test the issue";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with Skill: " + this.skill + " with Job: " + JOB);
    }
}

package ro.ase.cts.gr1085.geeksForGeeks.Composite;

public class Developer implements Employee{
    private String name;
    private int id;
    private String position;

    public Developer(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id+" " +name+ " " + position);
    }
}

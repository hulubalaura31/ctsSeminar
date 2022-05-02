package ro.ase.cts.gr1085.geeksForGeeks.Composite;

public class Manager implements Employee{
    private String name;
    private int id;
    private String position;

    public Manager(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println(id+" " +name+ " " + position);
    }
}

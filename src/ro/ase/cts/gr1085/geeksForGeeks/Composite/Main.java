package ro.ase.cts.gr1085.geeksForGeeks.Composite;

public class Main {
    public static void main (String[] args)
    {
        Developer dev1 = new Developer( "Lokesh Sharma", 100, "Pro Developer");
        Developer dev2 = new Developer( "Vinay Sharma", 101, "Developer");
        CompanyDirector engDirectory = new CompanyDirector();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager( "Kushagra Garg", 200, "SEO Manager");
        Manager man2 = new Manager( "Vikram Sharma ", 201, "Kushagra's Manager");

        CompanyDirector accDirectory = new CompanyDirector();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirector directory = new CompanyDirector();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}

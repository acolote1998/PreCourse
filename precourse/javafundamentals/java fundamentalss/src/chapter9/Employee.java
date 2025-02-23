package chapter9;

public class Employee extends Person {

    public Employee() {
        super("julieta");
        System.out.println("In employee");
    }

    private int employeeID;
    private String title;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

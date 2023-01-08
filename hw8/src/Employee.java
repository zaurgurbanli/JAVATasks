public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int calculatePayroll() {
        return salary * 60/100;
    }

    public int  getAnnualReturn() {
        return 0;
    }
}

public class Manager extends Employee {
    private int annualReturn;

    public Manager(String name, int salary, int annualReturn) {
        super(name, salary);
        this.annualReturn = annualReturn;
    }

    public int getAnnualReturn() {
        return annualReturn;
    }

    @Override
    public int calculatePayroll() {
        return (super.getSalary() + annualReturn / 100) * 60 / 100;
    }
}

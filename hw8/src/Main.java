import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("John", 35000));
        list.add(new Manager("Duke", 50000, 25000));
        list.add(new Employee("Mary", 42000));
        list.add(new Employee("Steve", 45000));


        list.forEach(e ->
        {
            System.out.print("Name: " + e.getName() + ", ");
            System.out.print("Type: " + e.getClass().getSimpleName() + ", ");
            System.out.print("Base Salary: " + e.getSalary() + " EUR, ");
            System.out.print( e.getAnnualReturn()==0 ? "" : "Annual Return Benefit: " + e.getAnnualReturn() + " EUR, ");
            System.out.println("Payroll: " + e.calculatePayroll() + " EUR");
        });
    }
}
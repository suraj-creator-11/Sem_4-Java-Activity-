class Employee {
    void calculateSalary() {
        System.out.println("Salary calculation for Employee");
    }
}

// Subclass for Full-Time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee Salary: Rs. " + monthlySalary);
    }
}

// Subclass for Part-Time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part-Time Employee Salary: Rs. " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee(50000);
        PartTimeEmployee pt = new PartTimeEmployee(80, 300);

        ft.calculateSalary();
        pt.calculateSalary();
    }
}
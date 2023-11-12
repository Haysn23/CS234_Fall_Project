import java.util.List;

public class Employee {

    private String name;
    private String jobTitle;
    private int employeeId;
    private String email;
    private double salary;

    public Employee(String name, String jobTitle, int employeeId, String email, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
        this.email = email;
        this.salary = salary;
    }

    // Getters and setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Additional CRUD operations for employees

    public static void createEmployee(List<Employee> employees, String name, String jobTitle, int employeeId, String email, double salary) {
        employees.add(new Employee(name, jobTitle, employeeId, email, salary));
    }

    public void readEmployeeDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("Email: " + getEmail());
        System.out.println("Salary: $" + getSalary());
        System.out.println("------------------------");
    }

    public static void updateEmployeeDetails(List<Employee> employees, int index, String newName, String newJobTitle, String newEmail, double newSalary) {
        if (index >= 0 && index < employees.size()) {
            Employee employee = employees.get(index);
            employee.setName(newName);
            employee.setJobTitle(newJobTitle);
            employee.setEmail(newEmail);
            employee.setSalary(newSalary);
        }
    }

    public static void deleteEmployee(List<Employee> employees, int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobManagementSystem {

    private List<Employee> employees;
    private List<JobPosting> jobPostings;
    private static Scanner scanner;

    public JobManagementSystem() {
        employees = new ArrayList<>();
        jobPostings = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("Job Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Add Job Posting");
            System.out.println("4. List Job Postings");
            System.out.println("5. Delete Job Posting");
            System.out.println("6. Edit Job Posting");
            System.out.println("7. Show Job Posting Statuses");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    addJobPosting();
                    break;
                case 4:
                    listJobPostings();
                    break;
                case 5:
                    deleteJobPosting();
                    break;
                case 6:
                    editJobPosting();
                    break;
                case 7:
                    showJobPostingStatuses();
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 8);
    }

    private void addEmployee() {
        System.out.print("Enter employee name: ");
        final String name = scanner.nextLine();
        System.out.print("Enter employee job title: ");
        final String jobTitle = scanner.nextLine();
        System.out.print("Enter employee ID (1-100): ");
        int employeeId = readValidNumber(1, 100);
        System.out.print("Enter employee email: ");
        final String email = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Employee.createEmployee(employees, name, jobTitle, employeeId, email, salary);
        System.out.println("Employee added successfully!");
    }

    private void listEmployees() {
        for (Employee employee : employees) {
            employee.readEmployeeDetails();
        }
    }

    private void addJobPosting() {
        System.out.print("Enter job title: ");
        final String jobTitle = scanner.nextLine();
        System.out.print("Enter job description: ");
        final String description = scanner.nextLine();
        System.out.print("Enter job ID (1-100): ");
        int jobId = readValidNumber(1, 100);
        JobPosting.createJobPosting(jobPostings, jobTitle, description, description, description, description, false, jobId);
        System.out.println("Job posting added successfully!");
    }

    private void listJobPostings() {
        for (JobPosting jobPosting : jobPostings) {
            jobPosting.displayJobPostingDetails();
        }
    }

    private void deleteJobPosting() {
        System.out.print("Enter the index of the job posting to delete (1-100): ");
        int index = readValidNumber(1, 100);
        index--; // Adjust for 0-based indexing
        if (index >= 0 && index < jobPostings.size()) {
            jobPostings.get(index);
            JobPosting.deleteJobPosting(jobPostings, index);
            System.out.println("Job posting deleted successfully!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private void editJobPosting() {
        System.out.print("Enter the index of the job posting to edit (1-100): ");
        int index = readValidNumber(1, 100);
        index--; // Adjust for 0-based indexing
        if (index >= 0 && index < jobPostings.size()) {
            System.out.print("Enter new job title: ");
            final String newJobTitle = scanner.nextLine();
            System.out.print("Enter new job description: ");
            final String newDescription = scanner.nextLine();

            jobPostings.get(index);
            JobPosting.updateJobPosting(jobPostings, index, newJobTitle, newDescription, newDescription, newDescription, newDescription, false);
            System.out.println("Job posting edited successfully!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private void showJobPostingStatuses() {
        for (JobPosting jobPosting : jobPostings) {
            jobPosting.displayJobPostingDetails();
        }
    }

    private int readValidNumber(int min, int max) {
        int number;
        do {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
            number = scanner.nextInt();
            scanner.nextLine(); // consume newline
        } while (number < min || number > max);
        return number;
    }

    public static void main(String[] args) {
        JobManagementSystem jobManagementSystem = new JobManagementSystem();
        jobManagementSystem.start();
    }
}
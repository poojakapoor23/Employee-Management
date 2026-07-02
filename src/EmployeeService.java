import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeService {
    private LinkedList<Employee> employees = new LinkedList<>();

    void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name");
        String name = sc.nextLine();
        System.out.println("Enter Employee age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee department");
        String dept = sc.nextLine();
        System.out.println("Enter Salary of Employee");
        Double salary = sc.nextDouble();
        Employee emp1 = new Employee(id, name, age, dept, salary);
        employees.add(emp1);
    }

    void viewEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }

    void searchEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.employee_id == id) {
                System.out.println("Employee exists");
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee not found");
    }

    void updateEmployee(int id) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n Update Employee ");
            System.out.println("1. Update Name");
            System.out.println("2. Update Age");
            System.out.println("3. Update Department");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit Update");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();   // Consume newline

            boolean found = false;

            for (Employee employee : employees) {

                if (employee.employee_id == id) {

                    found = true;

                    switch (choice) {

                        case 1:
                            System.out.print("Enter updated name: ");
                            String name = sc.nextLine();
                            employee.setName(name);
                            System.out.println("Name updated successfully.");
                            break;

                        case 2:
                            System.out.print("Enter updated age: ");
                            int age = sc.nextInt();
                            employee.setAge(age);
                            System.out.println("Age updated successfully.");
                            break;

                        case 3:
                            System.out.print("Enter updated department: ");
                            String department = sc.nextLine();
                            employee.setDepartment(department);
                            System.out.println("Department updated successfully.");
                            break;

                        case 4:
                            System.out.print("Enter updated salary: ");
                            double salary = sc.nextDouble();
                            employee.setSalary(salary);
                            System.out.println("Salary updated successfully.");
                            break;

                        case 5:
                            System.out.println("Exiting Update Menu");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;
                }
            }

            if (!found) {
                System.out.println("Employee with ID " + id + " not found.");
                break;
            }

        } while (choice != 5);
    }


    void deleteEmployee() {

    }

    void findEmployeeById() {

    }

    void displayDepartments() {

    }

    void sortEmployees() {

    }
}

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeService {
    private LinkedList<Employee> employees= new LinkedList<>();

    void addEmployee() {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Employee ID");
      int id= sc.nextInt();
      sc.nextLine();
      System.out.println("Enter Employee name");
      String name= sc.nextLine();
      System.out.println("Enter Employee age");
      int age= sc.nextInt();
      sc.nextLine();
      System.out.println("Enter Employee department");
      String dept= sc.nextLine();
      System.out.println("Enter Salary of Employee");
      Double salary=sc.nextDouble();
      Employee emp1 = new Employee(id,name,age,dept,salary);
      employees.add(emp1);
    }

    void viewEmployees() {
        for(Employee employee:employees)
        {
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
        System.out.println("Enter the choice  what you want to update");
        System.out.println("1. Update Name");
        System.out.println("2. Update Age ");
        System.out.println("3. Update Department");
        System.out.println("4. Update Salary");
        System.out.println("5. Update All Details");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (Employee employee : employees) {
                    if (employee.employee_id == id)
                        employee.setName("Pooja");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice");
        }
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

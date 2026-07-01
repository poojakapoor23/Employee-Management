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

    void updateEmployee() {

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

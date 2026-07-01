import java.util.Scanner;

import static java.lang.System.exit;

class EmployeeManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService empService = new EmployeeService();
        int choice;
        do {
            System.out.println("\n Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    empService.addEmployee();
                    break;
                case 2:
                    empService.viewEmployees();
                    break;
                case 3:
                    System.out.println("Enter the id for searching");
                    int id=sc.nextInt();
                    empService.searchEmployee(id);
                    break;


                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
        while (choice != 5);
    }
}



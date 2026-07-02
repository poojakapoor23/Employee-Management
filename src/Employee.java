public class Employee {
    int employee_id;
    String name;
    int age;
    String department;
    double salary;

    public Employee(int id, String name, int age, String department, double salary) {
        this.employee_id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department)
    {
        this.name=name;
    }
    @Override
    public String toString() {
        return "Employee{id=" + employee_id +
                ", name='" + name + "'" +
                ", age=" + age +
                ", department='" + department + "'" +
                ", salary=" + salary + "}";
    }
}





import model.Employee;
import service.EmployeeSystem;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EmployeeSystem employeeSystem = new EmployeeSystem(10);

        Employee employee = new Employee("Ivan", "Ivanov", "Ivanovich", 30000, 1);
        Employee employee2 = new Employee("Petr", "Petrov", "Petrovich", 35000, 2);
        Employee employee3 = new Employee("Anton", "Antonov", "Antonovich", 40000, 3);

       employeeSystem.addEmployee(employee);
       employeeSystem.addEmployee(employee2);
       employeeSystem.addEmployee(employee3);

       Employee[] emps = employeeSystem.getAllEmployees();

        int number = employeeSystem.getEmployeeLowSalary(38000);


        System.out.println(number);

      // model.Employee[] emps1 = employeeSystem.getEmployeeLowSalary(38000);

     //  int number = employeeSystem.getEmployeeLowSalary(38000);




    }

}
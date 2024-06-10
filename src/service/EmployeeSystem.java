package service;

import model.Employee;

public class EmployeeSystem {
    private Employee[] employees;
    private int size;

    private int index;

    public EmployeeSystem(int size) {
        this.size = size;
        this.employees = new Employee[this.size];
        this.index = 0;

    }

    public int getAmountOfEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            } else break;
        }
        return count;
    }

    public Employee[] getAllEmployees() {
        int amount = getAmountOfEmployees();
        Employee[] newArrayEmployees = new Employee[amount];
        for (int i = 0; i < amount; i++) {
            newArrayEmployees[i] = employees[i];
        }
        return newArrayEmployees;
    }


    public void addEmployee(Employee employee) {
        if (index < size) {
            employees[index++] = employee;
        }
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] getEmployeesByDepartment(int departmentId) {
        Employee[] employeesByDepartment = new Employee[size];
        int pointer = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentId() == departmentId) {
                employeesByDepartment[pointer++] = employee;
            }
        }
        return employeesByDepartment;
    }

    // метод, принимающий в качестве аргумента уровень зарплаты
    // и возвращающий кол-во сотрудников с зарплатой ниже нее
    public int getEmployeeLowSalary(int salary){
        int count = 0;
        Employee[] allEmployees = getAllEmployees();
        for (Employee employee : allEmployees) {
            if (employee.getSalary() < salary) {
                count++;
            }
        }
        return count;
    }


    // метод, возвращающий сотрудника с минимальной зарплатой
    public Employee getEmployeeWithMinSalary(){
        Employee[] allEmployees = getAllEmployees();

        Employee minSalaryEmployee = allEmployees[0];

        for (Employee employee : allEmployees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    // метод, возвращающий сотрудника с максимальной зарплатой
    public Employee getEmployeeWithMaxSalary(){
        Employee[] allEmployees = getAllEmployees();

        Employee maxSalaryEmployee = allEmployees[0];

        for (Employee employee : allEmployees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }
}



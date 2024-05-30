public class EmployeeSystem {
    private Employee[] employees;
    private int size;

    private int index;

    public Employee[] getEmployees() {
        return employees;
    }

    public EmployeeSystem(int size) {
        this.employees = new Employee[size];
        this.index = 0;
    }

    public void addEmployee(Employee employee) {
        if (index < size) {
            employees[index++] = employee;
        }
    }

    public Employee getEmployeeId(int id) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }
}



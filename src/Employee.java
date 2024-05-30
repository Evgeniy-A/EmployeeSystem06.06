import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private double salary;
    private int departmentId;

    private static int lastId = 1;

    public Employee() {
    }

    public Employee(int id, String name, String surname, String fatherName, double salary, int departmentId) {
        this.id = lastId++;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

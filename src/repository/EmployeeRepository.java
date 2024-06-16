package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Employee;


public class EmployeeRepository {
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "123";

    private Connection connection;

    public EmployeeRepository() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Employee> getAllEmployees() {
        try {
            ArrayList<Employee> employees = new ArrayList<>();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surName = resultSet.getString("sur_name");
                String fatherName = resultSet.getString("father_name");
                double salary = resultSet.getDouble("salary");
                long departmentId = resultSet.getLong("department_id");
                employees.add(new Employee(id, name, surName, fatherName, salary, departmentId));
            }
            return employees;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    // создание нового сотрудника
    public void createEmployee(String name, String surname,String  fatherName, double salary,long departmentId)  {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO employees (name," +
                            " surname, fathername, salary, department_id) values (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, fatherName);
            preparedStatement.setDouble(4, salary);
            preparedStatement.setLong(5, departmentId);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // удаление сотрудника
    public void deleteEmployeeById(long id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM employees WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // обновление данных существующего сотрудника
    public void updateEmployee(long id, String name, String surname, String fatherName, double salary, long departmentId) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE employees SET name = ? " +
                            ", surname = ?, fathername = ?, salary = ?, department_id = ? WHERE id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, fatherName);
            preparedStatement.setDouble(4, salary);
            preparedStatement.setLong(5, departmentId);
            preparedStatement.setLong(6, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
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

    }
}
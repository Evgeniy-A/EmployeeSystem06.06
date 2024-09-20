package clone.task57.employee;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Иван", 100000);
        Gson gson = new Gson();
        String json = gson.toJson(employee1);
        Employee employee2 = gson.fromJson(json, Employee.class);

        System.out.println(employee2.getName());
    }
}

package clone.taskcar;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.lang3.SerializationUtils;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, JsonProcessingException {

        Car car1 = new Car("Test", "Test");
        Car car2 = car1.clone();

        System.out.println(car2.getModel());

        Gson gson = new Gson();
        String json = gson.toJson(car1);
        Car car3 = gson.fromJson(json, Car.class);

        ObjectMapper mapper = new ObjectMapper();
        String gson2 = null;

        try {
            gson2 =  mapper.writeValueAsString(car1);
        } catch (JsonMappingException | JsonGenerationException e) {
            System.out.println(e.getMessage());
        }
            Car car4 = mapper.readValue(gson2, Car.class);

        Car car6 = SerializationUtils.clone(car1);
    }
}

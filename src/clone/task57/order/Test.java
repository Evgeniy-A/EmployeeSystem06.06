package clone.task57.order;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        Order order1 = new Order(123);

        ObjectMapper mapper = new ObjectMapper();
        String gson = null;
        try {
            gson = mapper.writeValueAsString(order1);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        Order order2 = mapper.readValue(gson, Order.class);
        System.out.println(order2.getOrderId());
    }
}
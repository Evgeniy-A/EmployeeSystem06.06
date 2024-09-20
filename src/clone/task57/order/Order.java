package clone.task57.order;

import java.io.Serializable;

public class Order implements Cloneable, Serializable {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

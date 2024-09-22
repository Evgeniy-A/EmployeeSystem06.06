package nested_classes.startic_nested_classies.task;

public class Order {
    Item item;

    public Order(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                '}';
    }

    public Order createNewOrder(String name, double price){
        Item item = new Item(name, price);
        Order order = new Order(item);
        System.out.println(order.toString());
        return order;
    }

    public static class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

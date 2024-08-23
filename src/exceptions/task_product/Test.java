package exceptions.task_product;

public class Test {
    public static void main(String[] args) {
        try {
            Product apple = new Product("Яблоко", 20);
            apple.sell(35);
        } catch (NegativeStockException | InsufficientStockException nse) {
            System.out.println(nse.getMessage());
        }
    }
}
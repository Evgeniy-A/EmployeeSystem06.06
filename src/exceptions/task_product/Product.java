package exceptions.task_product;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        if (stock < 0){
            throw new NegativeStockException("Отрицательный запас");
        }
        this.name = name;
        this.stock = stock;
    }

    public void sell(int quantity){
        if (quantity > stock){
            throw new InsufficientStockException("Недостаточно запаса");
        }
        this.stock -= quantity;
    }


}

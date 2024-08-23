package exceptions.task_product;

public class NegativeStockException extends RuntimeException{
    public NegativeStockException(String message) {
        super(message);
    }
}

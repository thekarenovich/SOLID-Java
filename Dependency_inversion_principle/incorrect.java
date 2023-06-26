public class OrderService {
    private DatabaseConnection databaseConnection;
    
    public OrderService() {
        this.databaseConnection = new DatabaseConnection();
    }
    
    public void processOrder(Order order) {
        // Обработка заказа с использованием databaseConnection
    }
}

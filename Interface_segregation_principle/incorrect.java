public interface OrderProcessor {
    void processOrder(Order order);
    void sendNotification(Order order);
}

public class OrderService implements OrderProcessor {
    public void processOrder(Order order) {
        // Обработка заказа
    }
    
    public void sendNotification(Order order) {
        // Отправка уведомления покупателю
    }
}

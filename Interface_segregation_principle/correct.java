// Принцип разделения интерфейса (Interface Segregation Principle - ISP): Клиенты не должны зависеть от интерфейсов, которые они не используют.
// В коде интерфейс OrderProcessor отвечает только за обработку заказа, а интерфейс OrderNotifier - за отправку уведомлений. 
// Класс OrderService реализует оба интерфейса и предоставляет реализацию соответствующих методов. 
// Клиенты могут зависеть только от необходимых интерфейсов, минимизируя связанность.
// В этом примере в методе main мы создаем экземпляр класса OrderService, реализующего оба интерфейса OrderProcessor и OrderNotifier. 
// Мы можем использовать объект orderProcessor для обработки заказа и объект orderNotifier для отправки уведомления, взаимодействуя только с необходимыми методами каждого интерфейса. 
// Такой подход позволяет клиентам зависеть только от нужных им интерфейсов и избегать неиспользуемых методов.

public interface OrderProcessor {
    void processOrder(Order order);
}

public interface OrderNotifier {
    void sendNotification(Order order);
}

public class OrderService implements OrderProcessor, OrderNotifier {
    public void processOrder(Order order) {
        // Обработка заказа
    }
    
    public void sendNotification(Order order) {
        // Отправка уведомления покупателю
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        
        OrderProcessor orderProcessor = new OrderService();
        orderProcessor.processOrder(order);
        
        OrderNotifier orderNotifier = new OrderService();
        orderNotifier.sendNotification(order);
    }
}

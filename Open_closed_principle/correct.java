// Принцип открытости/закрытости (Open/Closed Principle - OCP): Программные сущности должны быть открыты для расширения, но закрыты для модификации.
// В коде используется интерфейс OrderProcessor, который определяет метод processOrder(). Конкретные реализации интерфейса OrderProcessor (OnlineOrderProcessor и OfflineOrderProcessor) отвечают за обработку заказов онлайн и офлайн соответственно. 
// При необходимости добавления нового типа заказа, достаточно создать новую реализацию интерфейса OrderProcessor без изменения существующего кода.
// В этом примере в методе main мы создаем соответствующую реализацию OrderProcessor в зависимости от типа заказа и вызываем метод processOrder(). 
// Такой подход позволяет добавлять новые типы обработки заказов без изменения существующего кода, соблюдая принцип открытости/закрытости.

public interface OrderProcessor {
    void processOrder(Order order);
}

public class OnlineOrderProcessor implements OrderProcessor {
    public void processOrder(Order order) {
        // Обработка заказа онлайн
    }
}

public class OfflineOrderProcessor implements OrderProcessor {
    public void processOrder(Order order) {
        // Обработка заказа офлайн
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("online");
        
        OrderProcessor orderProcessor = null;
        if (order.getType().equals("online")) {
            orderProcessor = new OnlineOrderProcessor();
        } else if (order.getType().equals("offline")) {
            orderProcessor = new OfflineOrderProcessor();
        }
        
        orderProcessor.processOrder(order);
    }
}

// Принцип единственной ответственности (Single Responsibility Principle - SRP): Каждый класс должен иметь только одну причину для изменения.
// Во втором коде классы OrderPlacer, OrderPayer и Notifier отвечают только за одну конкретную задачу каждый. 
// Классы разделены по ответственности, что делает код более поддерживаемым и гибким при внесении изменений в будущем.
// В этом примере в методе main мы создаем отдельные экземпляры классов OrderPlacer, OrderPayer и Notifier и вызываем соответствующие методы. 
// Это позволяет логически разделить функциональность и управление процессом размещения заказа, оплаты заказа и отправки уведомлений. 
// Такой код легко поддерживать, изменять и тестировать, поскольку каждый класс отвечает только за одну конкретную задачу.

public class OrderPlacer {
    public void placeOrder() {
        // Размещение заказа
    }
}

public class OrderPayer {
    public void payOrder() {
        // Оплата заказа
    }
}

public class Notifier {
    public void sendNotification() {
        // Отправка уведомления покупателю
    }
}

public class Main {
    public static void main(String[] args) {
        OrderPlacer orderPlacer = new OrderPlacer();
        orderPlacer.placeOrder();
        
        OrderPayer orderPayer = new OrderPayer();
        orderPayer.payOrder();
        
        Notifier notifier = new Notifier();
        notifier.sendNotification();
    }
}

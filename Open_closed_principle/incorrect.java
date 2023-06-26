public class OrderProcessor {
    public void processOrder(Order order) {
        if (order.getType().equals("online")) {
            // Обработка заказа онлайн
        } else if (order.getType().equals("offline")) {
            // Обработка заказа офлайн
        }
    }
}

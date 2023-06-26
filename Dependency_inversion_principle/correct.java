// Принцип инверсии зависимостей (Dependency Inversion Principle - DIP): Зависимости должны строиться на абстракциях, а не на деталях, и модули верхнего уровня не должны зависеть от модулей нижнего уровня.
// В коде введен интерфейс DatabaseConnection, который определяет метод connect(). Класс MySqlConnection реализует этот интерфейс и предоставляет конкретную реализацию подключения к базе данных MySQL. 
// В классе OrderService используется абстракция DatabaseConnection вместо конкретной реализации, что позволяет легко изменять или заменять подключение к базе данных без изменения кода OrderService.
// В этом примере в методе main мы создаем экземпляр класса MySqlConnection, реализующего интерфейс DatabaseConnection. 
// Затем мы создаем экземпляр класса OrderService, передавая абстракцию databaseConnection. 
// Это позволяет нам использовать разные реализации DatabaseConnection без изменения кода OrderService, соблюдая принцип инверсии зависимостей.


public interface DatabaseConnection {
    void connect();
}

public class MySqlConnection implements DatabaseConnection {
    public void connect() {
        // Установка соединения с MySQL
    }
}

public class OrderService {
    private DatabaseConnection databaseConnection;
    
    public OrderService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    public void processOrder(Order order) {
        // Обработка заказа с использованием databaseConnection
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new MySqlConnection();
        OrderService orderService = new OrderService(databaseConnection);
        
        Order order = new Order();
        orderService.processOrder(order);
    }
}



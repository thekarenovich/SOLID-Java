// Принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP): Объекты в программе должны быть заменяемыми их наследниками без изменения корректности программы.
// В коде классы Rectangle и Square наследуют общий абстрактный класс Shape. Класс Shape определяет метод getArea(), который должен быть реализован в каждом наследнике. 
// Каждый подкласс (Rectangle и Square) замещает метод getArea() собственной реализацией, соответствующей своей геометрической форме. 
// Таким образом, объекты классов Rectangle и Square могут быть взаимозаменяемыми, не нарушая корректности программы.
// В этом примере в методе main мы создаем экземпляры классов Rectangle и Square с использованием общего типа Shape. 
// Это позволяет нам использовать объекты rectangle и square взаимозаменяемо и вызывать их методы без необходимости знать конкретный тип объекта. 
// Такой подход позволяет нам легко добавлять новые фигуры, не нарушая код, соблюдающий принцип LSP.

public abstract class Shape {
    public abstract int getArea();
}

public class Rectangle extends Shape {
    protected int width;
    protected int height;
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public int getArea() {
        return width * height;
    }
}

public class Square extends Shape {
    protected int side;
    
    public void setSide(int side) {
        this.side = side;
    }
    
    @Override
    public int getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());
        
        Shape square = new Square();
        square.setSide(4);
        System.out.println(square.getArea());
    }
}

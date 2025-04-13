package LessonFive;

// Главный интерфейс для всех фигур
interface Shape {
    // Методы, которые обязаны реализовать все фигуры
    double getArea();        // площадь
    double getPerimeter();   // периметр

    String getFillColor();   // цвет заливки
    String getBorderColor(); // цвет границы

    // Метод для вывода всех характеристик фигуры
    default void printInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------------------------");
    }
}

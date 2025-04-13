package LessonFive;

// Главный класс с методом main — запускается отсюда
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        // Создаём животных
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Васька");

        // Демонстрация бега и плавания
        dog1.run(150);
        dog1.swim(5);
        cat1.run(180);
        cat1.swim(2); // Кот не умеет плавать

        // Создаем миску с едой
        Bowl bowl = new Bowl(25);

        // Коты пробуют есть
        cat1.eatFrom(bowl);
        cat2.eatFrom(bowl); // Тут может не хватить еды

        // Добавим еды и снова покормим
        bowl.addFood(30);
        cat2.eatFrom(bowl);

        // Выведем статистику
        System.out.println("\nИТОГ:");
        System.out.println("Всего животных: " + Animal.getAnimalsCount());
        System.out.println("Котов: " + Cat.getCatsCount());
        System.out.println("Собак: " + Dog.getDogsCount());

        // Информация о сытости
        System.out.println(cat1.getName() + " сыт? " + cat1.isFull());
        System.out.println(cat2.getName() + " сыт? " + cat2.isFull());

        System.out.println("---------------------------");
        System.out.println("Задание 2");
        System.out.println();


        // Создаём разные фигуры
        Shape circle = new Circle(5, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Зелёный", "Синий");
        Shape triangle = new Triangle(3, 4, 5, "Жёлтый", "Фиолетовый");

        // Выводим информацию о каждой фигуре
        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("Прямоугольник:");
        rectangle.printInfo();

        System.out.println("Треугольник:");
        triangle.printInfo();
    }
}
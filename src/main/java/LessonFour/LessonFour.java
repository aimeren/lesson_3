package LessonFour;

public class LessonFour {
        public static void main(String[] args) {

            System.out.println("Задание 1 смотри в исходниках");
            System.out.println();

            System.out.println("Задание 2");

            // Создаем массив из 5 товаров
            Product[] productsArray = new Product[5];

            // Заполняем массив объектами
            productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
            productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025", "Apple Inc.", "USA", 6499, false);
            productsArray[2] = new Product("Xiaomi 14", "10.01.2025", "Xiaomi Corporation", "China", 3999, true);
            productsArray[3] = new Product("Google Pixel 9", "20.02.2025", "Google LLC", "USA", 5299, false);
            productsArray[4] = new Product("Huawei P60", "05.01.2025", "Huawei Technologies", "China", 4799, true);

            // Выводим информацию о всех товарах
            for (int i = 0; i < productsArray.length; i++) {
                productsArray[i].displayInfo();
            }

            System.out.println();
            System.out.println("Задание 3");
            // Создаем массив аттракционов
            Park.Attraction[] attractions = new Park.Attraction[3];
            attractions[0] = new Park.Attraction("Колесо обозрения", "10:00-22:00", 300);
            attractions[1] = new Park.Attraction("Американские горки", "11:00-20:00", 500);
            attractions[2] = new Park.Attraction("Дом с привидениями", "12:00-23:00", 400);

            // Создаем объект парка
            Park myPark = new Park("Центральный парк развлечений", attractions);

            // Выводим информацию о парке
            myPark.displayParkInfo();
        }
}

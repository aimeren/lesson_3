package LessonFour;

public class Park {
    private String parkName;
    private Attraction[] attractions;

    // Конструктор класса Park
    public Park(String parkName, Attraction[] attractions) {
        this.parkName = parkName;
        this.attractions = attractions;
    }

    // Внутренний класс для хранения информации об аттракционах
    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        // Конструктор внутреннего класса
        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void displayInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("-------------------------");
        }
    }

    // Метод для вывода информации о парке и его аттракционах
    public void displayParkInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println("Аттракционы:");


        for (int i = 0; i < attractions.length; i++) {
            attractions[i].displayInfo();
        }
    }

}
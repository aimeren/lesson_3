package LessonFive;

// Базовый класс Животное
abstract class Animal {
    protected String name;
    protected static int animalsCount = 0;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalsCount() {
        return animalsCount;
    }
}

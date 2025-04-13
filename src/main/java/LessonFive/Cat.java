package LessonFive;

// Класс Кот, наследуется от Животного
class Cat extends Animal {
    private static int catsCount = 0;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    // Метод кормления кота
    public void eatFrom(Bowl bowl) {
        if (isFull) {
            System.out.println(name + " уже сыт и не ест.");
            return;
        }
        int portion = 15;
        if (bowl.decreaseFood(portion)) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не поел, не хватило еды.");
        }
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }
}

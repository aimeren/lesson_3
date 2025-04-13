package LessonFive;

// Класс Миска с едой
class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    // Метод уменьшения еды, если хватает — возвращает true
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    // Добавить еду в миску
    public void addFood(int amount) {
        food += amount;
        System.out.println("В миску добавлено " + amount + " еды. Текущий остаток: " + food);
    }

    public int getFood() {
        return food;
    }
}

package homework7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n) {
        if ((food -= n) >= 0) {
            return true;
        } else {
            food += n;
            return false;
        }
    }
    public void info() {
        System.out.printf("В тарелке %s еды\n", food);
    }

    public void infoEat(Cat c, String name) {

        if (c.isSatiety()) {
            System.out.printf("Кот %s поел и сыт, в тарелке осталось %s еды\n", name, food);
        } else {
        System.out.printf("Кот %s остался голодным, в тарелке мало еды\n", name);
        }
    }

    public int additive(int add) {
     System.out.printf("Хозяин положил добавки %d еды\n", add);
     return food += add;
    }

}

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


    public int additive(int add) {
     System.out.printf("Хозяин положил добавки %d еды\n", add);
     return food += add;
    }

}

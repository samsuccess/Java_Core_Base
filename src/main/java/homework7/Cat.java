package homework7;

public class Cat {

    private String name;
    private int appetite;
    private static boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public static boolean isSatiety() {
        return satiety;
    }


    public static void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(getAppetite())) {
            setSatiety(true);
        } else  {
            setSatiety(false);
        }
    }

    public static void infoEat(Plate plate, String name) {

        if (isSatiety()) {
            System.out.printf("Кот %s поел и сыт, в тарелке осталось %s еды\n", name, plate.getFood());
        } else {
            System.out.printf("Кот %s остался голодным, в тарелке мало еды\n", name);
        }
    }

}

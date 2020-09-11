package homework7;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = {
                new Cat("Барсик", 450),
                new Cat("Мурзик", 450),
                new Cat("Тишка", 150),
                new Cat("Леопольд", 50)};
        Plate plate = new Plate(1000);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.infoEat(cat[i], cat[i].getName());
        }
        plate.additive(150);
        plate.info();


        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.infoEat(cat[i], cat[i].getName());
        }
    }
}

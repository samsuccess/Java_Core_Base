package homework6;

public class Main {
    public static void main(String[] args) {

        Animals[] animals = {
                new Dog("Тарзан", 500, 10),
                new Dog("Трезор", 500, 10),
                new Dog("Бобик", 500, 10),
                new Dog("Мухтар", 500, 10),
                new Cat("Мурзик", 200, 0),
                new Cat("Тиша", 200, 0),
                new Cat("Васька", 200, 0)
        };

//        for (int i = 0; i < animals.length; i++) {
//            animals[i].run(450);
//            animals[i].swim(5);
//        }

        animals[0].run(150);
        animals[0].swim(10);
        animals[1].run(550);
        animals[1].swim(50);
        animals[2].run(450);
        animals[2].swim(5);
        animals[3].run(350);
        animals[3].swim(8);
        animals[4].run(350);
        animals[4].swim(8);
        animals[5].run(350);
        animals[5].swim(8);
        animals[6].run(250);
        animals[6].swim(8);

        System.out.printf("Создано собак %d\n", Dog.getDogCount());
        System.out.printf("Создано котов %d\n", Cat.getCatCount());
        System.out.printf("Создано всего животных %d", Animals.getAnimalsCount());
    }
}

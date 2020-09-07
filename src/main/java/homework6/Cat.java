package homework6;

public class Cat extends Animals{

    static int catCount;

    public Cat(String name, int overrun, int overswim) {
        super(name, overrun, overswim);
        catCount ++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int distans) {
        System.out.printf("%s не умеет плавать.\n", getName());
    }
}

package homework6;

public class Dog extends Animals{

    static int dogCount;

    public Dog(String name, int overrun, int overswim) {
        super(name, overrun, overswim);

        dogCount ++;

    }

    public static int getDogCount() {
        return dogCount;
    }
}

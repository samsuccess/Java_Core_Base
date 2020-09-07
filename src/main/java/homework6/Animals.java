package homework6;

public class Animals {
    private String name;
    private int overrun;
    private int overswim;
    static int animalsCount;


    public Animals(String name, int overrun, int overswim) {
        this.name = name;
        this.overrun = overrun;
        this.overswim = overswim;
        animalsCount ++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public String getName() {
        return name;
    }

    public void run(int distans) {
        if(distans > overrun) {
            System.out.printf("%s не может пробежать больше %d метров.\n", name, overrun);
        } else {
        System.out.printf("%s пробежал(-а) %d метров.\n", name, distans);
        }
    }
    public void swim(int distans) {
        if(distans > overswim) {
            System.out.printf("%s не может проплыть больше %d метров.\n", name, overswim);
        } else {
            System.out.printf("%s проплыл(-а) %d метров.\n", name, distans);
        }
    }
}

package homework1;

public class Main {

    byte byt = 125;
    short shor = 15200;
    int in = 250000;
    long lon = 45015535554124L;
    float fl = 12.15f;
    double doub = 145.12545466455;
    char ch = 'd';
    boolean bool = true;

    public static void main(String[] args) {

    }

    static float expression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean summ(int a, int b){
        if (a + b >= 10 && a + b <= 20){
            return true;
        }
        return false;
    }

    static void printNum(int a){
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean num(int a){
       return a >= 0;
    }

    static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }

    static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void printYear(int year){
        if (checkYear(year)){
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }
    }
}

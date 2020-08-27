package homework3;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    static int user = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Привет! Сыграем в угадайку?");
        System.out.println("У тебя есть 3 попытки, чтобы угадать число от 0 до 9");
        do {
            player();
            user = scanner.nextInt();
        } while (user == 1);
        System.out.println("Игра окончена");
    }





    public static void player() {

        System.out.print("Поехали: ");
        Random random = new Random();

        int guess = random.nextInt(10);
        int count = 0;
        int maxCount = 3;
        do {
            int answer = scanner.nextInt();
            if (answer == guess) {
                System.out.println("Поздравляю, вы угадали! Сыграем ещё раз: 1 - ДА, 0 - НЕТ");
                return;
            } else if (answer > guess) {
                System.out.println("Вы ввели слишком большое число.");
            } else if (answer < guess) {
                System.out.println("Вы ввели слишком маленькое число.");
            }
            count++;
        } while (count != maxCount);

        System.out.println("Вы проиграли :(. Правильный ответ: " + guess + " Сыграем ещё раз: 1 - ДА, 0 - НЕТ");
        return;
    }




}

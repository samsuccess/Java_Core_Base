package homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord2 {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int guess = random.nextInt(words.length);
        System.out.println(words[guess]);
        System.out.println("Выбери фрукт из этого списка, который я загадал :\n" +
                "apple, orange, lemon, banana, apricot,\n avocado, broccoli, carrot, cherry, garlic,\n grape, melon, leak, kiwi, mango,\n mushroom, nut, olive, pea, peanut,\n pear, pepper, pineapple, pumpkin, potato");

        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("  Введите букву(-ы): ");
            String answer = scr.nextLine();// здесь ввод слова игроком
            if (answer.equals(words[guess])) {
                System.out.println("Поздравляю, Вы угадали слово!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {// здесь посимвольное сравнение введёного слова с загаданным
                    if (i < words[guess].length() && i < answer.length() && words[guess].charAt(i) == answer.charAt(i)) {
                        System.out.print(answer.charAt(i));
                    } else {
                        System.out.print('#');
                    }
                }
            }
        }
    }
}

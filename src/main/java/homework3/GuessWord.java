package homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        play();
        System.out.println("Поздравляю, Вы угадали слово!");
    }

    public static void play() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int rand = random.nextInt(words.length);
        String guess = words[rand];

//        System.out.println(guess);
        char[] arr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        System.out.println("Выбери фрукт из этого списка, который я загадал :\n" +
                "apple, orange, lemon, banana, apricot,\n avocado, broccoli, carrot, cherry, garlic,\n grape, melon, leak, kiwi, mango,\n mushroom, nut, olive, pea, peanut,\n pear, pepper, pineapple, pumpkin, potato");

        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("Введите букву(-ы): ");
            String answer = scr.nextLine();// здесь ввод слова игроком
            if (answer.equals(guess)){
                return;
            }

            for (int i = 0; i < answer.length(); i++) {// здесь посимвольное сравнение введёного слова с загаданным
                if (guess.charAt(i) == answer.charAt(i)) {
                    arr[i] = answer.charAt(i);
                }
            }
            for (int i = 0; i < arr.length; i++) {// здесь печать подсказки
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}



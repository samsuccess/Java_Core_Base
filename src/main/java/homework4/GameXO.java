package homework4;

import java.util.Random;
import java.util.Scanner;

public class GameXO {
    public static final int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! Поздравляем!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean winLine(int x, int y, int dx, int dy, char symb) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            x = x + i * dx;
            y = y + i * dy;
            if (isCellValid(x, y) && map[x][y] != symb){return false;}
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == symb){
                    for (int k = 0; k < SIZE; k++) {
                        // проверяем строки
                        if (winLine(k, 0, 0, 1, symb)) {return true;}
                        // проверяем столбцы
                        if (winLine(0, k, 1, 0, symb)) {return true;}
                    }
                    // проверяем диагонали
                    if (winLine(0, 0, 1, 1, symb)) {return true;}
                    if (winLine(0, 0, 1, -1, symb)) {return true;}
                }
            }
        }
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void aiTurn() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер cходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }



    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
package homework4;

import java.util.Random;
import java.util.Scanner;

public class GameXO {
    public static final int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
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

    public static boolean checkWin(char symb) {
        int j = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
             if (map[i][j] == symb && map[i][j + 1] == symb && map[i][j + 2] == symb) {return true;}
             if (map[j][i] == symb && map[j + 1][i] == symb && map[j + 2][i] == symb) {return true;}

        }
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {return true;}
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {return true;}
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {return true;}
//        for (int i = 0; i < DOTS_TO_WIN * 2; i++) {
//
//        }
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {return true;}
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {return true;}
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {return true;}

        if(map[0][0]==symb && map[1][1]==symb && map[2][2]==symb) {return true;}
        if(map[2][0]==symb && map[1][1]==symb && map[0][2]==symb) {return true;}

        return false;
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
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
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
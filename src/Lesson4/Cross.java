package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Cross {
    static final Random random = new Random();
    static Scanner scanner= new Scanner(System.in);

    static final int SIZE_X = 3; /* создаём перменные длины поля*/
    static final int SIZE_Y  = 3;
    private static final int TO_WIN = 3;

    static char [][] field = new char[SIZE_Y][SIZE_Y]; /* создаём поля ввиде двумерного массива */

    static final char PLAYER_DOT = 'x'; /* создаём "фишки" игроков */
    static final char AI_DOT = 'y';
    static final char EMPTY_DOT = '.'; /* создаём пустую ячейку */

    private static void initField () {     /* заполняем поля точками */
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }
    private static void printField() {   /*  печатаем поле */
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }
    private static void setSym(int y, int x, char sym) { /* метод заполнения поля символами игроков */
        field[y][x] = sym;
    }
    private static void playerStep() {  /* шаги игрока */
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() { /* шаги ИИ */
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }

    private static boolean isCellValid(int y, int x) {  /* проверка что число в указанных пределах */
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    private static boolean isFieldFull() {   /* проверка что поле пустое */
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }
    private static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (checkLine(i, j, 0, 1,  sym)) return true;   // проверим линию по х
                if (checkLine(i, j, 1, 1,  sym)) return true;   // проверим по диагонали х у
                if (checkLine(i, j, 1, 0,  sym)) return true;   // проверим линию по у
                if (checkLine(i, j, -1, 1, sym)) return true;  // проверим по диагонали х -у
            }
        }
        return false;
    }

    private static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_X - 1 || wayY > SIZE_Y - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != sym) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
        }

    }



}

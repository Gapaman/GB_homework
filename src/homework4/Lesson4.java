package homework4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    static final int SIZE = 5;
    static final char DOT_EMPTY = '•';
    static final char HUMAN = 'X';
    static final char COMPUTER = '0';
    static final String EMPTY = " ";
    static final char FIRSTCHAR = '֍';
    static final int WINSIZE = 3;

    static char map[][] = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {

        initMap();
        printMap();
        playGame();

    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

    private static void printMap() {
        printHead();
        printRow();

    }

    private static void printHead() {
        System.out.print(FIRSTCHAR + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);

        }
    }

    private static void printNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printRow() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);
            for (int j = 0; j < SIZE; j++) {

                System.out.print(map[i][j] + EMPTY);

            }
            System.out.println();
        }

    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            checkEnd(HUMAN);
            computerTurn();
            printMap();
            checkEnd(COMPUTER);
        }
    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        System.out.println("Ваш ход");
        do {
            System.out.print("\nСтрока\n");
            rowNumber = scanner.nextInt();
            System.out.print("\nСтолбец\n");
            colNumber = scanner.nextInt();
        } while (!isValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = HUMAN;

    }

    private static boolean isValid(int rowNumber, int colNumber, boolean isCOMPUTER) {
        if (!isCOMPUTER && (rowNumber < 1) || (rowNumber > SIZE) || (colNumber < 1) || (colNumber > SIZE)) {
            System.out.println("Вы ввели не существующее поле");
            return false;
        }
        if (map[rowNumber - 1][colNumber - 1] != DOT_EMPTY) {
            if (!isCOMPUTER) {
                System.out.println("Это поле занято");
            }
            return false;

        }
        return true;

    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;
        if (checkWin(symbol)) {
            String winMassage;
            if (symbol == HUMAN) {
                winMassage = "Вы победили!!!";

            } else {
                winMassage = "Компьютер победил!";

            }
            isEnd = true;
            System.out.println(winMassage);

        }

        if (!isEnd && fullMap()) {
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            restartGame();
        }
    }

    private static boolean checkWin(char symbol) {

        for (int i = 0; i < SIZE - WINSIZE + 1; i++) {
            for (int j = 0; j < SIZE - WINSIZE + 1; j++) {
                if (checkDiagonal(symbol, i, j) || checkLines(symbol, i, j)) return true;
            }
        }
        return false;
    }


    private static boolean checkLines(char symbol, int vertical, int horizontal) {
        boolean cols, rows;
        for (int i = vertical; i < WINSIZE + vertical; i++) {
            cols = true;
            rows = true;
            for (int j = horizontal; j < WINSIZE + horizontal; j++) {
                cols &= (map[i][j] == symbol);
                rows &= (map[j][i] == symbol);
            }

            if (cols || rows) return true;
        }

        return false;
    }


    static Boolean checkDiagonal(char symbol, int diagonalMain, int diagonalAuxiliary) {
        boolean diagonalA = true;
        boolean diagonalB = true;
        for (int i = 0; i < WINSIZE; i++) {
            diagonalA &= (map[i + diagonalMain][i + diagonalAuxiliary] == symbol);
            diagonalB &= (map[WINSIZE - i - 1 + diagonalMain][i + diagonalAuxiliary] == symbol);

        }
        if (diagonalA || diagonalB) return true;
        return false;
    }

    private static boolean fullMap() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int rowNumber, int colNumber) {
        return isValid(rowNumber, colNumber, false);
    }

    private static void computerTurn() {
        int rowNumber, colNumber;
        System.out.println("\nХод компьтера\n");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = COMPUTER;

    }

    private static void restartGame() {
        System.out.println("Хотите сыграть еще раз? Если да нажмите-1,нет-0");
        int decision = scanner.nextInt();
        switch (decision) {
            case 0:
                System.exit(0);
                break;
            case 1:
                startGame();
                break;
            default:
                System.out.println("Вы ввели не правильную цифру");
                restartGame();
        }
    }
}
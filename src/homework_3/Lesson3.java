package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        playGame();

    }


    static void playGame() {
        System.out.println("Отгадайте цифру от 0 до 9.\nУ Вас есть 3 попытки.");
        System.out.println("Введите число:");
        int number = (int) (Math.random() * 10);
        int guess_number;
        int count;
        for (int i = 2; i >= 0; i--) {
            guess_number = scanner.nextInt();
            count = i;
            if (guess_number == number) {
                System.out.println("Поздравляю!Вы выиграли");
                break;
            } else if (guess_number > number)
                System.out.println("Загаданное число меньше.\nОсталось попыток: " + count);

            else if (guess_number < number)
                System.out.println("Загаданное число больше.\nОсталось попыток:" + count);

            if (i == 0)
                System.out.println("Вы проиграли!!!");

        }
        exitGame();
    }

    static void exitGame() {
        System.out.println("Повторить Игру еще раз? 1-да,0-нет");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("До скорой встречи!!!");
                System.exit(0);
                break;
            case 1:
                playGame();
                break;
            default:
                IsValid();

        }
    }

    static void IsValid() {
        System.out.println("Вы ввели не корректное значение.");
        exitGame();
    }


}










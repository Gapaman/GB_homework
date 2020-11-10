package homework_8;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayGame {
    public static void playGame(int number, JLabel check_answer, JButton button, JTextField text, int count) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                play_Game_check(check_answer, text, button, number, count);
            }
        });

    }

    static void play_Game_check(JLabel check_answer, JTextField text, JButton button, int number, int count) {
        int guess_number = Integer.parseInt(text.getText());
        count--;
        if (guess_number == number) {
            check_answer.setText("Поздравляю! Вы выиграли!");
            restartGame();

        } if (guess_number > number) {
            check_answer.setText("Загаданное число меньше.\nОсталось попыток: " + count);
            playGame(number, check_answer, button, text, count);
        }  if (guess_number < number) {
            check_answer.setText("Загаданное число больше.\nОсталось попыток:" + count);
            playGame(number, check_answer, button, text, count);
        }  if (count <= 0) {
            check_answer.setText("Вы проиграли!!!");
            restartGame();
        }
    }

    public static void restartGame() {
        int reply = JOptionPane.showConfirmDialog(null, "Повторить Игру еще раз?", "Restart Game", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Main.createGame();

        } else {
            System.exit(0);
        }
    }

}

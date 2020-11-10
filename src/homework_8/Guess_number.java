package homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

public class Guess_number extends JFrame {
    PlayGame playGame=new PlayGame();
    public Guess_number() {
        setTitle("Угадай число");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, 400, 400);
        JLabel jLabel = new JLabel("Отгадайте цифру от 0 до 9. У Вас есть 3 попытки.");
        JLabel jLabel1 = new JLabel("ВВЕДИТЕ ЧИСЛО:");

        JTextField text = new JTextField(3);
        JButton button = new JButton("Проверить число");
        JLabel check_answer=new JLabel("");
        setLayout(new FlowLayout());

        add(jLabel);
        add(jLabel1);
        add(text);
        add(button);
        add(check_answer);
        setResizable(false);


        int number = (int) (Math.random() * 10);
        int count=3;
        PlayGame.playGame(number,check_answer,button,text,count);
        setVisible(true);
    }


}

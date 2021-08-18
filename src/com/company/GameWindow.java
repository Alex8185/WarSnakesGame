package com.company;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow() {

        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 690);
        setLocation(800, 800);
        add(new GameField());
        setVisible(true);

    }

    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
    }
}

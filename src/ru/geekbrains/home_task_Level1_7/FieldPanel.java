package ru.geekbrains.home_task_Level1_7;

import javax.swing.*;
import java.awt.*;


public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;



    FieldPanel() {
        setBackground(Color.GRAY);



    }



    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {


        System.out.printf("damn mode: %d\nfield size: %d,\nwin length: %d\n", gameMode, fieldSizeX, winLength);

    }


}

package ru.geekbrains.home_task_Level1_7;

import javax.swing.*;
import java.awt.*;


public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;



    FieldPanel() {
        setBackground(Color.GRAY);



    }

    protected void paintComponent(Graphics g, int x1, int fsx ) {
        super.paintComponent(g);
     //   int y1 = x1;
        for (int i = 1; i < fsx; i++) {
            g.drawLine(i * x1 / fsx, 0, i * x1 / fsx, x1);
        }
        for (int i = 1; i < fsx; i++) {
            g.drawLine(0, i * x1 / fsx, x1, i * x1 / fsx);
        }

    }



    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        paintComponent( getGraphics(),getWidth(),fieldSizeX );


      //  System.out.printf("damn mode: %d\nfield size: %d,\nwin length: %d\n", gameMode, fieldSizeX, winLength);

    }


}

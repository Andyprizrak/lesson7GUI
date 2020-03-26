package ru.geekbrains.home_task_Level1_7;

import javax.swing.*;
import java.awt.*;


public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;



    FieldPanel() {
        setBackground(Color.GRAY);



    }

    // Как то коряво сделано через одно место
// repaint() не работает
    
    public void Map_Draw(int x1, int y1, int fsx) {
        Graphics g = getGraphics();
        for (int i = 1; i < fsx; i++) {
            g.drawLine(i * x1 / fsx, 0, i * x1 / fsx, y1);
        }
        for (int i = 1; i < fsx; i++) {
            g.drawLine(0, i * y1 / fsx, x1, i * y1 / fsx);
        }
    }



    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        Map_Draw(507,555, fieldSizeX);


        System.out.printf("damn mode: %d\nfield size: %d,\nwin length: %d\n", gameMode, fieldSizeX, winLength);

    }


}

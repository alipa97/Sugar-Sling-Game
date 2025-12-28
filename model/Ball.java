package model;

import java.awt.*;
import java.util.Random;

public class Ball {
    public int x, y;
    public int size = 30;
    public boolean collected = false;

    public Ball() {
        Random rand = new Random();
        x = rand.nextInt(700) + 50;
        y = rand.nextInt(500) + 50;
    }

    public void draw(Graphics2D g2) {
        if (!collected) {
            g2.setColor(Color.CYAN);
            g2.fillOval(x, y, size, size);
        }
    }
}
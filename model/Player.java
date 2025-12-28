package model;

import java.awt.*;

public class Player {
    private int x, y;
    private int speed = 5;
    private boolean up, down, left, right;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        if (up) y -= speed;
        if (down) y += speed;
        if (left) x -= speed;
        if (right) x += speed;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.PINK);
        g2.fillOval(x, y, 40, 40);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setUp(boolean b) { up = b; }
    public void setDown(boolean b) { down = b; }
    public void setLeft(boolean b) { left = b; }
    public void setRight(boolean b) { right = b; }
}
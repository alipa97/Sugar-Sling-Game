package model;

import java.awt.*;

public class Lasso {
    private int startX, startY;
    private int targetX, targetY;
    private boolean active = false;

    public void shoot(int sx, int sy, int tx, int ty) {
        startX = sx;
        startY = sy;
        targetX = tx;
        targetY = ty;
        active = true;
    }

    public void draw(Graphics2D g2) {
        if (active) {
            g2.setColor(Color.BLACK);
            g2.drawLine(startX, startY, targetX, targetY);
        }
    }

    public void reset() { active = false; }
    public boolean isActive() { return active; }
    public int getEndX() { return targetX; }
    public int getEndY() { return targetY; }
}

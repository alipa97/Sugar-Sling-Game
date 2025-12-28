package viewmodel;

import model.*;

import java.util.ArrayList;

public class GameViewModel {
    private Player player;
    private ArrayList<Ball> balls;
    private Lasso lasso;
    private int score = 0;
    private int timeLeft = 60; // seconds
    private long lastTime = System.currentTimeMillis();

    public GameViewModel() {
        player = new Player(400, 300);
        balls = new ArrayList<>();
        for (int i = 0; i < 5; i++) balls.add(new Ball());
        lasso = new Lasso();
    }

    public void update() {
        player.update();
        updateTimer();

        if (lasso.isActive()) {
            for (Ball ball : balls) {
                if (!ball.collected && isHit(ball, lasso)) {
                    ball.collected = true;
                    score += 10;
                    lasso.reset();
                    break;
                }
            }
        }
    }

    private void updateTimer() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime >= 1000) {
            timeLeft--;
            lastTime = currentTime;
        }
    }

    private boolean isHit(Ball b, Lasso l) {
        int bx = b.x + b.size / 2;
        int by = b.y + b.size / 2;
        return Math.abs(bx - l.getEndX()) < 30 && Math.abs(by - l.getEndY()) < 30;
    }

    public void shootLasso(int tx, int ty) {
        lasso.shoot(player.getX() + 20, player.getY() + 20, tx, ty);
    }

    public Player getPlayer() { return player; }
    public ArrayList<Ball> getBalls() { return balls; }
    public Lasso getLasso() { return lasso; }
    public int getScore() { return score; }
    public int getTimeLeft() { return timeLeft; }
}
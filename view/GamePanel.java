package view;

import viewmodel.GameViewModel;
import model.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private GameViewModel viewModel;
    private Timer timer;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        this.addKeyListener(this);

        viewModel = new GameViewModel();
        timer = new Timer(16, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Ball b : viewModel.getBalls()) {
            b.draw(g2);
        }

        viewModel.getPlayer().draw(g2);
        viewModel.getLasso().draw(g2);

        g2.setColor(Color.BLACK);
        g2.drawString("Score: " + viewModel.getScore(), 10, 20);
        g2.drawString("Time Left: " + viewModel.getTimeLeft(), 10, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewModel.update();
        repaint();
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> viewModel.getPlayer().setLeft(true);
            case KeyEvent.VK_RIGHT -> viewModel.getPlayer().setRight(true);
            case KeyEvent.VK_UP -> viewModel.getPlayer().setUp(true);
            case KeyEvent.VK_DOWN -> viewModel.getPlayer().setDown(true);
            case KeyEvent.VK_SPACE -> {
                var p = viewModel.getPlayer();
                viewModel.shootLasso(p.getX() + 40, p.getY() + 20);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> viewModel.getPlayer().setLeft(false);
            case KeyEvent.VK_RIGHT -> viewModel.getPlayer().setRight(false);
            case KeyEvent.VK_UP -> viewModel.getPlayer().setUp(false);
            case KeyEvent.VK_DOWN -> viewModel.getPlayer().setDown(false);
        }
    }
}
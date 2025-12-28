package view;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    public GameWindow(GamePanel gamePanel) {
        setTitle("Sugar Sling");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(gamePanel);
        pack();  // agar menyesuaikan ukuran panel
        setLocationRelativeTo(null); // center screen
        setVisible(true);
    }
}

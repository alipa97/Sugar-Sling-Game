/* Saya Alifa Salsabila dengan NIM 2308138 mengerjakan evaluasi 
Tugas Masa Depan dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */


import javax.swing.*;
import view.GamePanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sugar Sling Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GamePanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
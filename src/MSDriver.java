import javax.swing.*;
/**
 * Title: GameDriver.java
 * Description: The driver of game "Minesweeper".
 * @author Shi Xuan
 * @version 1.0
 */
public class MSDriver {
    public static void main(String[] args) {
        InitialGUI frame = new InitialGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(540,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
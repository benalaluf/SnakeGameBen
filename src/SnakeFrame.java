import javax.swing.*;

public class SnakeFrame extends JFrame {
    public SnakeFrame()  {

        this.add(new SnakePanle());
        this.setTitle("Ben First Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

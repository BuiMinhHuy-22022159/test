import javax.swing.JFrame;

public class Main extends JFrame {

    public Main() {
        add(new SnakeGame());
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        JFrame ex = new Main();
        ex.setVisible(true);
    }
}

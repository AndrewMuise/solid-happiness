import javax.swing.*;

/**
 * Created by amuis on 5/27/2016.
 */
public class Window extends JFrame {

    public Window(int width, int height) {
        JFrame w = new JFrame("This is a window!");

        w.setSize(width, height);
        w.setResizable(false);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        w.setVisible(true);
    }

}

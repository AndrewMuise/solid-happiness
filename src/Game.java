/**
 * Created by amuis on 5/27/2016.
 */
public class Game implements Runnable {

    public static final int WIDTH = 1920, HEIGHT = WIDTH * 9 / 16;
    public static Window window;

    public static void main(String[] args) {

        window = new Window(WIDTH, HEIGHT);


    }

    public Game() {
        //TODO is this something I should be doing?
        run();
    }

    @Override
    public void run() {
        //TODO make a tick to solve the logic
        //TODO Find some way to render objects
    }
}

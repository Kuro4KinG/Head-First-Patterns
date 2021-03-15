import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, I'm being stopped...";
        repaint();
    }

    public void destroy() {
        // Аплет уничтожается
    }

    public void paint(Graphics graphics) {
        graphics.drawString(message, 5, 15);
    }

    public static void main(String[] args) {
        new MyApplet();
    }
}

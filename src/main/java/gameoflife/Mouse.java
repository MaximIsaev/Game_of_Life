package gameoflife;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse implements MouseListener, MouseMotionListener {
    private static int x;

    private static int y;

    private static volatile boolean[] buttonsDown = new boolean[256];

    public static void create(Canvas c) {
        Mouse listner = new Mouse();
        c.addMouseListener(listner);
        c.addMouseMotionListener(listner);

    }

    public static boolean isButtonDown(int buttonCode) {
        return buttonsDown[buttonCode];
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getCellX() {
        return x / Cell.CELL_SIZE;
    }

    public static int getCellY() {
        return y / Cell.CELL_SIZE;
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        buttonsDown[e.getButton()] = true;

    }

    public void mouseReleased(MouseEvent e) {
        buttonsDown[e.getButton()] = false;

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}

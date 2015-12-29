package gameoflife;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {

    public static final int SPACE = 32;
    public static final int KEY_ENTER = 10;
    public static boolean[] keysDown = new boolean[256];

    public static void create(Canvas c) {
        c.addKeyListener(new KeyBoard());
    }

    public static boolean isKeyDown(int keyCode) {
        return keysDown[keyCode];
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        keysDown[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e) {
        keysDown[e.getKeyCode()] = false;
    }
}

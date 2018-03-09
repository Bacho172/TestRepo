/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Adam Bachorz
 */
public class GraphicsEngine extends ThreadHelper implements Runnable {

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        Handler.renderAll(g);

        g.dispose();
        bs.show();
    }

    @Override
    public void run() {
        while (true) {
            render();
        }
    }

}

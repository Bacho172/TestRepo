/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.ABORT;
import static java.awt.image.ImageObserver.ERROR;
import static java.awt.image.ImageObserver.SOMEBITS;

/**
 *
 * @author Adam Bachorz
 */
public class TestObject extends ClickableObject{

    public TestObject(Dimension size, Point position) {
        super(size, position);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(position.x, position.y, size.width, size.height);
    }

    @Override
    public void step() {
    }

    
    
}

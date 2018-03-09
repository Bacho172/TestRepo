/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Adam Bachorz
 */
public abstract class ClickableObject extends GameObject implements MouseListener {

    public ClickableObject(Dimension size, Point position) {
        super(size, position);
        Handler.getGraphicsEngine().addMouseListener(this);
        // kolejna zmiana
        // i kolejna
        // inna zmiana
    }

    private boolean mouseIsAbove(MouseEvent e) {
        return new Rectangle(e.getPoint(), new Dimension(1, 1)).intersects(texture);
    }
    
    private boolean leftClicked(MouseEvent e){
        return mouseIsAbove(e) && e.getButton() == MouseEvent.BUTTON1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (leftClicked(e)) {
            System.out.println("ok");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (true) {
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (true) {
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (true) {
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

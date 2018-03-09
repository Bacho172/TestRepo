/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author Adam Bachorz
 */
public class ClickableTest extends Canvas{

    /**
     * @param args the command line arguments
     */
    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;

    public ClickableTest(){
        setBackground(Color.WHITE);
        setLocation(10, 10);
        setSize(new Dimension(WIDTH-500, HEIGHT));
        setEnabled(true);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame window = new JFrame(ClickableTest.class.getSimpleName());
        Handler.initAllObjects();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(Handler.getGraphicsEngine());
        
        window.setSize(WIDTH, HEIGHT);
        window.setEnabled(true);
        window.setVisible(true);
       
        new Thread(Handler.getObject(0)).start();
        new Thread(Handler.getGraphicsEngine()).start();
        
    }
    
}

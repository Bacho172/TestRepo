/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author Adam Bachorz
 */
public abstract class GameObject extends GraphicsInterface implements Runnable{
    
    protected Rectangle texture;
    protected Color color; 
    protected Dimension size;
    protected Point position;

    public GameObject(Dimension size, Point position) {
        this.size = size;
        this.position = position;
        texture = new Rectangle(position, size); 
    }
    
    public abstract void step();

    @Override
    public void run() {
        while(true){
            step();
        }
    }

    public Rectangle getTexture() {
        return texture;
    }

    public void setTexture(Rectangle texture) {
        this.texture = texture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    
    
}

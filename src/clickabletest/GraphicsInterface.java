/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Adam Bachorz
 */
public abstract class GraphicsInterface extends ThreadHelper{
         
    public abstract void draw(Graphics g);
    
    
    
}

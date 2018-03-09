/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import static clickabletest.ClickableTest.HEIGHT;
import static clickabletest.ClickableTest.WIDTH;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Adam Bachorz
 */
public abstract class Handler {
    private static GraphicsEngine graphicsEngine = new GraphicsEngine();
    private static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static GraphicsEngine getGraphicsEngine() {
        return graphicsEngine;
    }
    
    
    
    public static GameObject getObject(int i){
        return gameObjects.get(i);
    }
    public static void addObject(ClickableObject go){
        gameObjects.add(go);
    }
    public static void renderAll(Graphics g){
        for(GameObject go : gameObjects){
            go.draw(g);
        }
    }
    
    public static void initAllObjects(){
        addObject(new TestObject(new Dimension(100, 150), new Point(WIDTH/2, HEIGHT/2)));
        addObject(new TestObject(new Dimension(100, 150), new Point(20, 20)));
    }
}

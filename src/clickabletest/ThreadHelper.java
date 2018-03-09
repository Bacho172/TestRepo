/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickabletest;

import java.awt.Canvas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adam Bachorz
 */
public abstract class ThreadHelper extends Canvas implements Runnable{
    
    protected Thread thread = new Thread(this, "Main TH");
    protected boolean running = false;
    
    public void threadStart() {
        if(running) return;
        running = true;
        thread.start();
    }
    public void threadStop() {
        if(!running) return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger("TH").log(Level.SEVERE, null, ex);
        }
    }
    
}

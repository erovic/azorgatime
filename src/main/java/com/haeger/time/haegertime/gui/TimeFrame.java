package com.haeger.time.haegertime.gui;

import com.haeger.time.haegertime.mymodel.MyModel;
import javax.swing.JFrame;

/**
 *
 * Baut die GUI zusammen
 * 
 * @author Andreas
 */
public class TimeFrame extends JFrame{
 
    private MyModel model;
    
    public TimeFrame(){
        
        setTitle("AzorgaTIME - Time is Time");
        
        //Todo - Aus Property holen
        setSize(800, 600);
        
        model = new MyModel();
        
    }
    
}

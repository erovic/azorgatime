
package com.haeger.time.haegertime.gui.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;

/**
 *
 * Interims-Komponente fuer die Datumseingabe
 * 
 * @author Andreas
 */
public class AzorgaDateTextField extends JFormattedTextField{
   
    public AzorgaDateTextField(){
        
        super(new SimpleDateFormat("dd.MM.yyyy"));
        
        this.addActionListener(actionListener);
        
        
    }
    
    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            System.out.println( ((AzorgaDateTextField)e.getSource()).getText() );
        }
    };
       

    

    
}

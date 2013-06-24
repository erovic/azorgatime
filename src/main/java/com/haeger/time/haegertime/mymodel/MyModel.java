/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.mymodel;
import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* Model - interagiert irgendwo zwischen GUI und der per Spring
* injizierten DAO (also eigentlich eher eine Fassade)
*
* @author andreas
*/

@Service
public class MyModel {
   
    private KategorieDAO katdao;
    
    private ZeiterfassungItemDAO itemdao;
    
    @Autowired
    public void setkatdao( KategorieDAO katdao ){
        
        this.katdao = katdao;
        
    }
    
    @Autowired
    public void setitemdao( ZeiterfassungItemDAO itemdao ){
        
        this.itemdao = itemdao;
        
    }

    /**
     * 
     * Methode nur fuer Testzwecke
     * 
     */
    public void testModel() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}

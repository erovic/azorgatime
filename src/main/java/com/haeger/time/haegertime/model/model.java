
package com.haeger.time.haegertime.model;

import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Model - interagiert irgendwo zwischen GUI und der per Spring
 * injizierten DAO
 * 
 * @author andreas
 */

@Service
public class model {
   
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
    
}

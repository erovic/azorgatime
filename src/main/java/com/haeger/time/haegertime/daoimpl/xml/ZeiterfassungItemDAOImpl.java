/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.xml;

import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import com.haeger.time.haegertime.pojo.Kategorie;
import com.haeger.time.haegertime.pojo.ZeiterfassungItem;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * XML-Implementierung der Schnittstellendefinition
 * ZeiterfassungItemDAO
 * 
 * @author andreas
 */
public class ZeiterfassungItemDAOImpl implements ZeiterfassungItemDAO{

    /**
     * 
     * Speichert ZeiterfassungItem-Objekt in XML-Datei
     * 
     * @param item 
     */
    public void save(ZeiterfassungItem item) {
       
        try{
            
            JAXBContext context = JAXBContext.newInstance(ZeiterfassungItem.class);
            
            Marshaller m = context.createMarshaller();
            
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            /**
             * Fuer Testzwecke auf die Konsole schreiben
             */
            m.marshal(item, System.out);
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
    }

    public void update(ZeiterfassungItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ZeiterfassungItem get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ZeiterfassungItem get(Date datum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(ZeiterfassungItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Kategorie> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

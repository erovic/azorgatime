package com.haeger.time.haegertime.daoimpl.xml;

import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.pojo.Kategorie;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * Implementiert das Interface KategorieDAO fuer Persistierung mit
 * XML-Dateien
 * 
 * @author Andreas
 */
public class KategorieDAOImpl implements KategorieDAO{

    /**
     * 
     * Speichert Kategorie-Objekt in XML-Datei
     * 
     * @param kategorie 
     */
    public void save(Kategorie kategorie) {
        
        try{
            
            JAXBContext context = JAXBContext.newInstance(Kategorie.class);
            
            Marshaller m = context.createMarshaller();
            
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            /**
             * Fuer Testzwecke auf die Konsole schreiben
             */
            m.marshal(kategorie, System.out);
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
        
    }

    public void update(Kategorie kategorie) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kategorie get(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Kategorie kategorie) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Kategorie> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(ArrayList<Kategorie> kategorien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

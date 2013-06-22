/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.csv;

import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.pojo.Kategorie;
import java.util.ArrayList;

/**
 *
 * Implementiert das Interface KategorieDAO fuer Persistierung mit
 * einem CSV-Dokument
 * 
 * @author Andreas
 */
public class KategorieDAOImpl implements KategorieDAO{

    public void save(Kategorie kategorie) {
        
    }

    public void update(Kategorie kategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Kategorie get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Kategorie kategorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Kategorie> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

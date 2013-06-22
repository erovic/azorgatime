
package com.haeger.time.haegertime.dao;

import com.haeger.time.haegertime.pojo.Kategorie;
import java.util.ArrayList;

/**
 *
 * Schnittstellendefinition fuer KategorieDAO-Implementierungs
 * 
 * @author Andreas
 */
public interface KategorieDAO {
    
    public void save(Kategorie kategorie);
    
    public void save(ArrayList<Kategorie> kategorien);
    
    public void update(Kategorie kategorie);
    
    public Kategorie get(int index);
    
    public void delete(Kategorie kategorie);
    
    public void delete(int index);
    
    public ArrayList<Kategorie> getAll();
    
}

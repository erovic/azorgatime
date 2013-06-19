package com.haeger.time.haegertime.dao;

import com.haeger.time.haegertime.pojo.Kategorie;
import com.haeger.time.haegertime.pojo.ZeiterfassungItem;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * Schnittstellendefinition für ZeiterfassungItemDao-Implementierung
 * 
 * @author Andreas
 */
public interface ZeiterfassungItemDAO {
    
    public void save(ZeiterfassungItem item);
    
    public void update(ZeiterfassungItem item);
    
    public ZeiterfassungItem get(int index);
    
    public ZeiterfassungItem get(Date datum);
    
    public void delete(ZeiterfassungItem item);
    
    public void delete(int index);
    
    public ArrayList<Kategorie> getAll();
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.csv;

import au.com.bytecode.opencsv.CSVWriter;
import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import com.haeger.time.haegertime.pojo.Kategorie;
import com.haeger.time.haegertime.pojo.ZeiterfassungItem;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * Implementiert das Interface ZeiterfassungItemDAO fuer CSV
 * 
 * @author andreas
 */

@Service
public class ZeiterfassungDAOImpl implements ZeiterfassungItemDAO{

    public void save(ZeiterfassungItem item) {
                try{
            //todo -> Properties!
            String csv = "d:\\item.csv";
            
            CSVWriter writer = new CSVWriter(new FileWriter(csv, true), ';');
              
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            
            String[] data = new String[] {item.getMitarbeiterName(),
                                            item.getTaetigkeit(),
                                            df.format(item.getDatum()),
                                            String.valueOf(item.getDauer()),
                                            item.getKategorie().getKategorieName(),
                                            item.getMonat(),
                                            item.getJahr()};
                            
            writer.writeNext(data);
            
            writer.close();
                        
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

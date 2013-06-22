/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.csv;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.pojo.Kategorie;
import com.sun.org.apache.bcel.internal.generic.F2D;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Implementiert das Interface KategorieDAO fuer Persistierung mit
 * einem CSV-Dokument
 * 
 * @author Andreas
 */
public class KategorieDAOImpl implements KategorieDAO{

    public void save(Kategorie kategorie) {
       
        try{
            //todo -> Properties!
            String csv = "d:\\output.csv";
            
            CSVWriter writer = new CSVWriter(new FileWriter(csv));
            
            List<String[]> data = new ArrayList<String[]>();
            
            for(Kategorie kat : getAll()){
                
                data.add(new String[]{kat.getKategorieName()});
                
            }
            
            data.add(new String[]{kategorie.getKategorieName()});
            
            writer.writeAll(data);
            
            writer.close();
                        
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
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

    /**
     * 
     * Gibt Liste aller CSV-Eintraege zurueck
     * 
     * @return 
     */
    public ArrayList<Kategorie> getAll() {
        
        ArrayList<Kategorie> result = new ArrayList<Kategorie>();
        
        try{
        
            String [] row = null;
            
            //todo -> Properties!
            String csv = "d:\\output.csv";
            
            CSVReader reader = new CSVReader(new FileReader(csv));
            
            List content = reader.readAll();
            
            for(Object object : content){
                
                Kategorie kat = new Kategorie(object.toString());
                
                result.add(kat);
                
            }
        
        }catch(Exception e){
        
            e.printStackTrace();
            
        }
    
        
        return result;
        
    }

    public void save(ArrayList<Kategorie> kategorien) {
        
        try{
            
            for ( Kategorie kat : kategorien){
                
                save(kat);
                
            }
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
        
    }
    
}

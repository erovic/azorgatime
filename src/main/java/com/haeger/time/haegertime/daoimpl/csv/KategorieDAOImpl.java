/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.csv;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.pojo.Kategorie;

import java.io.File;

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
            String csv = "d:\\kategorie.csv";
            
            CSVWriter writer = new CSVWriter(new FileWriter(csv, true), ';');
               
            String[] data = kategorie.getKategorieName().split(";");
            
            writer.writeNext(data);
            
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
        
            String[] row = null;
            //todo -> Properties!
            String csv = "d:\\kategorie.csv";
            
            CSVReader reader = new CSVReader(new FileReader(csv));
            
            List content = reader.readAll();
            
            for(Object object : content){
                
                row = (String[]) object;
                
                Kategorie kat = new Kategorie(row[0]);
                
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

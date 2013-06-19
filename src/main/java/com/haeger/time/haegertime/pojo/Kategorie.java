
package com.haeger.time.haegertime.pojo;

/**
 * Diese Klasse speichert die verschiedenen Kategorien, die ein
 * Zeiterfassungseintrag haben kann
 * 
 * @author Andreas Monschau
 */
public class Kategorie {
    
    private String kategorieName;
    
    public String getKategorieName(){
        return this.kategorieName;
    }
    
    public Kategorie(String kategorieName){
        this.kategorieName = kategorieName;
    }
    
}

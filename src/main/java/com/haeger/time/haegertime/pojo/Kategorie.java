
package com.haeger.time.haegertime.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Diese Klasse speichert die verschiedenen Kategorien, die ein
 * Zeiterfassungseintrag haben kann
 * 
 * @author Andreas Monschau
 */

@XmlRootElement
public class Kategorie {
    
    private String kategorieName;
    
    public String getKategorieName(){
        return this.kategorieName;
    }
    
    public Kategorie(String kategorieName){
        this.kategorieName = kategorieName;
    }
    
}


package com.haeger.time.haegertime.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * Diese Klasse speichert die verschiedenen Kategorien, die ein
 * Zeiterfassungseintrag haben kann
 * 
 * @author Andreas Monschau
 */

@XmlRootElement
@Entity
public class Kategorie {
    
    @XmlElement(required=true)
    private String kategorieName;
    @Id
    private Long id;
    
    public String getKategorieName(){
        return this.kategorieName;
    }
    
    public Kategorie(String kategorieName){
        this.kategorieName = kategorieName;
    }
    
    /**
     * Default Konstruktor fuer JAXB
     */
    public Kategorie(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

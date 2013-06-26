package com.haeger.time.haegertime.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * Diese Klasse speichert statistische Zeitangaben zu einzelnen Items
 * der Zeiterfassung
 * 
 * @author Andreas
 */
@Entity
public class ItemZeitraum {
    @Id
    private Long id;
    
    private String monat;

    
            
    private String jahr;
    
    
    public String getMonat() {
        return monat;
    }
    


    public void setMonat(String monat) {
        this.monat = monat;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
}

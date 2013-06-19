/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.pojo;

import java.util.Date;

/**
 * 
 * Ein Objekt dieser Klasse stellt einen vollständigen Zeiterfassungssatz dar
 *
 * @author Andreas
 */
public class ZeiterfassungItem {
    
    private String mitarbeiterName;
    
    private Date datum;
    
    private String taetigkeit;
    
    private double dauer;
    
    private Kategorie kategorie;

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public String getMitarbeiterName() {
        return mitarbeiterName;
    }

    public void setMitarbeiterName(String mitarbeiterName) {
        this.mitarbeiterName = mitarbeiterName;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getTaetigkeit() {
        return taetigkeit;
    }

    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    public double getDauer() {
        return dauer;
    }

    public void setDauer(double dauer) {
        this.dauer = dauer;
    }
    
   public ZeiterfassungItem(){
       
   }
  
    
}

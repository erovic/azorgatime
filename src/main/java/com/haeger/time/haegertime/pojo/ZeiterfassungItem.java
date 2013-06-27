package com.haeger.time.haegertime.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Ein Objekt dieser Klasse stellt einen vollständigen Zeiterfassungssatz dar
 *
 * @author Andreas
 */

@XmlRootElement
@Entity
public class ZeiterfassungItem implements Serializable {
    
    private String mitarbeiterName;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datum;
    
    private String taetigkeit;
    
    private double dauer;
    
    @OneToOne
    private Kategorie kategorie;
    
    @OneToOne
    private ItemZeitraum zeitraum = new ItemZeitraum();
    @Id
    private Long id;
    
    public String getMonat(){
        return zeitraum.getMonat();
    }
    
    public String getJahr(){
        return zeitraum.getJahr();
    }

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
        
        SimpleDateFormat fmt = new SimpleDateFormat();
        
        fmt.applyPattern("MMMM");
        
        this.zeitraum.setMonat(fmt.format(datum));
        
        fmt.applyPattern("yyyy");
        
        this.zeitraum.setJahr( fmt.format(datum));
        
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(datum);
        
        this.zeitraum.setKalenderwoche(calendar.get(Calendar.WEEK_OF_YEAR));
        
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.model;

import java.sql.Date;


/**
 *
 * @author emin
 */
public class Satis {
    private int id, calisanId;
    private String tarih;
    private float tutar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(int calisanId) {
        this.calisanId = calisanId;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    
    public float getTutar() {
        return tutar;
    }

    public void setTutar(float tutar) {
        this.tutar = tutar;
    }
}

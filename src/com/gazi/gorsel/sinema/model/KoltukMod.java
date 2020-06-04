/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.model;


/**
 *
 * @author emin
 */
public class KoltukMod {
    private int koltukId, seansId;
    private String tarih;
    private boolean dolu;

    public int getSeansId() {
        return seansId;
    }

    public void setSeansId(int seansId) {
        this.seansId = seansId;
    }

    public int getKoltukId() {
        return koltukId;
    }

    public void setKoltukId(int koltukId) {
        this.koltukId = koltukId;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public boolean isDolu() {
        return dolu;
    }

    public void setDolu(boolean dolu) {
        this.dolu = dolu;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.model;

import javax.swing.Icon;


/**
 *
 * @author emin
 */
public class Film {
    private int id, kategoriId, yonetmenId, sure;
    private String ad, aciklama;
    private float fiyat;

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    private boolean altyazi, ucBoyut;
    private Icon afis;

    public Icon getAfis() {
        return afis;
    }

    public void setAfis(Icon afis) {
        this.afis = afis;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public int getYonetmenId() {
        return yonetmenId;
    }

    public void setYonetmenId(int yonetmenId) {
        this.yonetmenId = yonetmenId;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public boolean isAltyazi() {
        return altyazi;
    }

    public void setAltyazi(boolean altyazi) {
        this.altyazi = altyazi;
    }

    public boolean isUcBoyut() {
        return ucBoyut;
    }

    public void setUcBoyut(boolean ucBoyut) {
        this.ucBoyut = ucBoyut;
    }

}

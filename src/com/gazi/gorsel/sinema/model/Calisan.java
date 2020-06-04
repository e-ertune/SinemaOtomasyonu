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
public class Calisan {
    private int id;
    private int yetkiid;
    private String ad, kimlikNo, kullaniciAdi, sifre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the yetkiid
     */
    public int getYetkiid() {
        return yetkiid;
    }

    /**
     * @param yetkiid the yetkiid to set
     */
    public void setYetkiid(int yetkiid) {
        this.yetkiid = yetkiid;
    }
}

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
public class TableModel {
    private String film, salon, seans, tarih, calisan;
    private float tutar;

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getSeans() {
        return seans;
    }

    public void setSeans(String seans) {
        this.seans = seans;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getCalisan() {
        return calisan;
    }

    public void setCalisan(String calisan) {
        this.calisan = calisan;
    }

    public float getTutar() {
        return tutar;
    }

    public void setTutar(float tutar) {
        this.tutar = tutar;
    }
}

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
public class Koltuk {
    private int id, salonId;
    private String koltukNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalonId() {
        return salonId;
    }

    public void setSalonId(int salonId) {
        this.salonId = salonId;
    }

    public String getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }
}

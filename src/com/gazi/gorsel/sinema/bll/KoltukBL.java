/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Koltuk;
import com.gazi.gorsel.sinema.model.KoltukMod;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emin
 */
public class KoltukBL {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    int sonuc = 0;

    public int KoltukKaydet(List<Koltuk> list) {
        try {
            conn = ConnectionProvider.getConn();
            for (int i = 0; i < list.size(); i++) {
                ps = conn.prepareStatement("Insert into tblKoltuk (KoltukNo, SalonID) values (?, ?)");
                ps.setString(1, list.get(i).getKoltukNo());
                ps.setInt(2, list.get(i).getSalonId());
                sonuc += ps.executeUpdate();
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public List<Koltuk> KoltukGetir(int salonId) {
        List<Koltuk> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblKoltuk where SalonID = ?");
            ps.setInt(1, salonId);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Koltuk k = new Koltuk();
                k.setId(rs.getInt("ID"));
                k.setKoltukNo(rs.getString("KoltukNo"));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public boolean KoltukDoluMu(int id, int seansId, String tarih){
        boolean doluMu = false;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from KoltukMod where KoltukID = ? and SeansID = ? and Tarih = ? and Dolu = 1");
            ps.setInt(1, id);
            ps.setInt(2, seansId);
            ps.setString(3, tarih);
            rs = ps.executeQuery();
            if (rs.next()) {        
                doluMu = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return doluMu;
    }
    
    public  void KoltukDoldur(KoltukMod k){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into KoltukMod (KoltukID, SeansID, Tarih, Dolu) values (?, ?, ?, ?)");
            ps.setInt(1, k.getKoltukId());
            ps.setInt(2, k.getSeansId());
            ps.setString(3, k.getTarih());
            ps.setBoolean(4, k.isDolu());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

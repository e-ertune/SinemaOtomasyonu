/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Salon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emin
 */
public class SalonBL {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int SalonKaydet(Salon s){
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblSalon (Adi, Sira, Genislik) values (?, ?, ?);");
            ps.setString(1, s.getAd());
            ps.setInt(2, s.getSira());
            ps.setInt(3, s.getGenislik());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public Salon SalonGetir(String ad){
        Salon s = new Salon();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblSalon where Adi = ?;");
            ps.setString(1, ad);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s.setId(rs.getInt("ID"));
                s.setAd(rs.getString("Adi"));
                s.setSira(rs.getInt("Sira"));
                s.setGenislik(rs.getInt("Genislik"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
    
    public List<Salon> SalonListele(){
        List<Salon> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblSalon");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Salon s = new Salon();
                s.setId(rs.getInt("ID"));
                s.setAd(rs.getString("Adi"));
                s.setSira(rs.getInt("Sira"));
                s.setGenislik(rs.getInt("Genislik"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}

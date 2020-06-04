/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Seans;
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
public class SeansBL {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    int sonuc;

    public int SeansKaydet(Seans s) {
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblSeans (Saat) values (?)");
            ps.setString(1, s.getSaat());
            sonuc = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    public List<Seans> SeansListele() {
        List<Seans> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblSeans");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Seans s = new Seans();
                s.setId(rs.getInt(1));
                s.setSaat(rs.getTime(2).toString());
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public Seans SeansGetir(String saat){
        Seans s = new Seans();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblSeans where Saat = ?");
            ps.setString(1, saat);
            rs = ps.executeQuery();
            if (rs.next()) {
                s.setId(rs.getInt("ID"));
                s.setSaat(rs.getString("Saat"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}

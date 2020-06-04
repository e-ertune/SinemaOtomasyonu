/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Kategori;
import com.gazi.gorsel.sinema.model.Yetki;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEYZA NUR TAN
 */
public class YetkiBL {
    int sonuc = 0;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
      public List<Yetki> YetkiListele() {
        List<Yetki> Yetkilist = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblYetki");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Yetki yt = new Yetki();
                yt.setYetkiid(rs.getInt("Yetkiid"));
                yt.setYetki(rs.getString("yetki"));
                Yetkilist.add(yt);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Yetkilist;
    }
    
    public int YetkiIdGetir(String yetki){
        int id = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select Yetkiid from tblYetki where yetki = ?");
            ps.setString(1, yetki);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("Yetkiid");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
}

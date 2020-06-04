/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Yonetmen;
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
public class YonetmenBL {
    int sonuc = 0;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int YonetmenKayit(Yonetmen y){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblYonetmen (Adi) values (?);");
            ps.setString(1, y.getAdSoyad());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public int YonetmenSil(int id){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Delete from tblYonetmen where ID = ?");
            ps.setInt(1, id);
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public List<Yonetmen> YonetmenListele(){
        List<Yonetmen> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblYonetmen");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Yonetmen y = new Yonetmen();
                y.setId(rs.getInt("ID"));
                y.setAdSoyad(rs.getString("Adi"));
                list.add(y);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public int YonetmenIdGetir(String ad){
        int id = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select ID from tblYonetmen where Adi = ?");
            ps.setString(1, ad);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("ID");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
}

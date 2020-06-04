/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Kategori;
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
public class KategoriBL {
    int sonuc = 0;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int KategoriKayit(Kategori k){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("INSERT INTO tblKategori (Adi) VALUES (?);");
            ps.setString(1, k.getAd());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public int KategoriSil(int id){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Delete from tblKategori where ID = ?");
            ps.setInt(1, id);
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public List<Kategori> KategoriListele() {
        List<Kategori> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblKategori");
            rs = ps.executeQuery();
            while (rs.next()) {                
                Kategori k = new Kategori();
                k.setId(rs.getInt("ID"));
                k.setAd(rs.getString("Adi"));
                list.add(k);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public int KategoriIdGetir(String ad){
        int id = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select ID from tblKategori where Adi = ?");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Calisan;
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
public class CalisanBL {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    int sonuc;
    
    public int GirisYap(Calisan c){
        int id = 0;
  
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select ID from tblCalisan where KullaniciAdi = ? and Sifre = ?");
            ps.setString(1, c.getKullaniciAdi());
            ps.setString(2, c.getSifre());
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
    public int GirisYapanIdGetir(int id){
        int ytkid = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select Yetkiid from tblCalisan where ID = ?");
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()) {
                ytkid = rs.getInt("Yetkiid");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ytkid;
    }
    
    public int CalisanEkle(Calisan c){
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblCalisan (AdiSoyadi, KimlikNo, KullaniciAdi, Sifre, Yetkiid) values (?, ?, ?, ?, ?)");
            ps.setString(1, c.getAd());
            ps.setString(2, c.getKimlikNo());
            ps.setString(3, c.getKullaniciAdi());
            ps.setString(4, c.getSifre());
            ps.setInt(5,c.getYetkiid());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    
    public List<Calisan> CalisanListele(){
        List<Calisan> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblCalisan");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Calisan c = new Calisan();
                c.setId(rs.getInt(1));
                c.setAd(rs.getString(2));
                c.setKimlikNo(rs.getString(3));
                c.setKullaniciAdi(rs.getString(4));
                c.setSifre(rs.getString(5));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}

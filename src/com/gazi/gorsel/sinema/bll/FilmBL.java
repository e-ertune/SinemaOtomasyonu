/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Film;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author emin
 */
public class FilmBL {

    int sonuc = 0;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int FilmKayit(Film f) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream os;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblFilm (Adi, KategoriID, UcBoyutlu, Altyazili, Sure, YonetmenID, Afis, Aciklama, Fiyat) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, f.getAd());
            ps.setInt(2, f.getKategoriId());
            ps.setBoolean(3, f.isUcBoyut());
            ps.setBoolean(4, f.isAltyazi());
            ps.setInt(5, f.getSure());
            ps.setInt(6, f.getYonetmenId());
            try {
                os = new ObjectOutputStream(baos);
                os.writeObject(f.getAfis());
            } catch (IOException ex) {
                Logger.getLogger(FilmBL.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps.setBlob(7, (new ByteArrayInputStream(baos.toByteArray())));
            ps.setString(8, f.getAciklama());
            ps.setFloat(9, f.getFiyat());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    public int FilmSil(int id) {
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Delete from tblFilm where ID = ?");
            ps.setInt(1, id);
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    public List<Film> FilmListele() {
        List<Film> list = new ArrayList<>();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblFilm");
            rs = ps.executeQuery();
            while (rs.next()) {
                Film f = new Film();
                f.setId(rs.getInt("ID"));
                f.setAd(rs.getString("Adi"));
                f.setKategoriId(rs.getInt("KategoriID"));
                f.setUcBoyut(rs.getBoolean("UcBoyutlu"));
                f.setAltyazi(rs.getBoolean("Altyazili"));
                f.setSure(rs.getInt("Sure"));
                f.setAciklama(rs.getString("Aciklama"));
                f.setFiyat(rs.getFloat("Fiyat"));
                list.add(f);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public Film FilmGetir(String ad){
        Film f = new Film();
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Select * from tblFilm where Adi = ?");
            ps.setString(1, ad);
            rs = ps.executeQuery();
            if (rs.next()) {
                f.setId(rs.getInt("ID"));
                f.setAd(rs.getString("Adi"));
                f.setKategoriId(rs.getInt("KategoriID"));
                f.setUcBoyut(rs.getBoolean("UcBoyutlu"));
                f.setAltyazi(rs.getBoolean("Altyazili"));
                f.setSure(rs.getInt("Sure"));
                f.setAciklama(rs.getString("Aciklama"));
                Blob b = rs.getBlob("Afis");
                try {
                    ObjectInputStream is = new ObjectInputStream(b.getBinaryStream());
                    f.setAfis((Icon)is.readObject());
                } catch (IOException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                f.setFiyat(rs.getFloat("Fiyat"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return f;
    }

}

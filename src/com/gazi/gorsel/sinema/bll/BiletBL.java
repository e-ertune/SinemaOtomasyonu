/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Bilet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author emin
 */
public class BiletBL {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int BiletKayit(Bilet b){
        int sonuc = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblBilet (FilmID, SeansID, KoltukID, SatisID) values (?, ?, ?, ?)");
            ps.setInt(1, b.getFilmId());
            ps.setInt(2, b.getSeansId());
            ps.setInt(3, b.getKoltukId());
            ps.setInt(4, b.getSatisId());
            sonuc = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
}

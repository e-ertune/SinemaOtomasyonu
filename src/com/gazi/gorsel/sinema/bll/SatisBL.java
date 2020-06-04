/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.bll;

import com.gazi.gorsel.sinema.db.conn.ConnectionProvider;
import com.gazi.gorsel.sinema.model.Satis;
import com.gazi.gorsel.sinema.model.TableModel;
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
public class SatisBL {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int SatisYap(Satis s) {
        int id = 0;
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("Insert into tblSatis (CalisanID, Tarih, Tutar) values (?, ?, ?)");
            ps.setInt(1, s.getCalisanId());
            ps.setString(2, s.getTarih());
            ps.setFloat(3, s.getTutar());
            ps.executeUpdate();
            PreparedStatement ps1 = conn.prepareStatement("Select max(ID) as ID from tblSatis");
            rs = ps1.executeQuery();
            if (rs.next()) {
                id = rs.getInt("ID");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    public List<TableModel> SatisListele(String bas, String son, String calisan) {
        List<TableModel> list = new ArrayList<>();
        if (calisan.equals("Tümü")) {
            calisan = "%";
        }
        try {
            conn = ConnectionProvider.getConn();
            ps = conn.prepareStatement("select distinct tblFilm.Adi, tblSalon.Adi, tblSeans.Saat, tblSatis.Tutar, tblSatis.SatisTarih, tblCalisan.AdiSoyadi from tblBilet\n"
                    + "inner join tblFilm on tblFilm.ID = tblBilet.FilmID\n"
                    + "inner join tblKoltuk on tblBilet.KoltukID = tblKoltuk.ID\n"
                    + "inner join tblSalon on tblKoltuk.SalonID = tblSalon.ID\n"
                    + "inner join tblSatis on tblSatis.ID = tblBilet.SatisID\n"
                    + "inner join tblCalisan on tblSatis.CalisanID = tblCalisan.ID\n"
                    + "inner join tblSeans on tblBilet.SeansID = tblSeans.ID\n"
                    + "where tblSatis.SatisTarih > ? and tblSatis.SatisTarih < ? and tblCalisan.AdiSoyadi like ?");
            ps.setString(1, bas);
            ps.setString(2, son);
            ps.setString(3, calisan);
            rs = ps.executeQuery();
            while (rs.next()) {
                TableModel tm = new TableModel();
                tm.setFilm(rs.getString(1));
                tm.setSalon(rs.getString(2));
                tm.setSeans(rs.getTime(3).toString());
                tm.setTutar(rs.getFloat(4));
                tm.setTarih(rs.getTimestamp(5).toString());
                tm.setCalisan(rs.getString(6));
                list.add(tm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}

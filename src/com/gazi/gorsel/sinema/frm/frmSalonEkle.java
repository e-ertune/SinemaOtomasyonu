/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.frm;

import com.gazi.gorsel.sinema.bll.KoltukBL;
import com.gazi.gorsel.sinema.bll.SalonBL;
import com.gazi.gorsel.sinema.model.Koltuk;
import com.gazi.gorsel.sinema.model.Salon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author emin
 */
public class frmSalonEkle extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmSalonEkle
     */
    public frmSalonEkle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        cmbSira = new javax.swing.JComboBox<>();
        cmbGenislik = new javax.swing.JComboBox<>();
        btnKaydet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Salon Ekle");
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setPreferredSize(new java.awt.Dimension(780, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salon Adı");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sıra Sayısı");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genişlik");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtAd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 83, -1));

        cmbSira.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbSira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        getContentPane().add(cmbSira, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 83, -1));

        cmbGenislik.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbGenislik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(cmbGenislik, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 83, -1));

        btnKaydet.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 160, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/sinema/img/salon.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        SalonBL sbl = new SalonBL();
        Salon s = new Salon();
        List<Koltuk> list = new ArrayList<>();
        s.setAd(txtAd.getText().trim());
        s.setGenislik(Integer.parseInt(cmbGenislik.getSelectedItem().toString()));
        s.setSira(Integer.parseInt(cmbSira.getSelectedItem().toString()));
        if (sbl.SalonKaydet(s) > 0) {
            JOptionPane.showMessageDialog(null, "Salon kayıt başarılı.");
            Salon sal = sbl.SalonGetir(s.getAd());
            KoltukBL kbl = new KoltukBL();
            for (int i = 0; i < s.getSira(); i++) {
                for (int j = 0; j < s.getGenislik(); j++) {
                    Koltuk k = new Koltuk();
                    k.setKoltukNo(String.valueOf((char) (65 + i)) + (j + 1));
                    k.setSalonId(sal.getId());
                    list.add(k);
                }
            }
            int sonuc = kbl.KoltukKaydet(list);
            JOptionPane.showMessageDialog(null, sonuc + " koltuk, " + s.getAd() + " salonuna başarıyla eklendi.");
        }
    }//GEN-LAST:event_btnKaydetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JComboBox<String> cmbGenislik;
    private javax.swing.JComboBox<String> cmbSira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAd;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.frm;

import com.gazi.gorsel.sinema.bll.FilmBL;
import com.gazi.gorsel.sinema.bll.KategoriBL;
import com.gazi.gorsel.sinema.bll.YonetmenBL;
import com.gazi.gorsel.sinema.model.Film;
import com.gazi.gorsel.sinema.model.Kategori;
import com.gazi.gorsel.sinema.model.Yonetmen;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author emin
 */
public class frmFilmEkle extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFilmEkle
     */
    KategoriBL kbl = new KategoriBL();
    YonetmenBL ybl = new YonetmenBL();

    public frmFilmEkle() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        checkUcBoyut = new javax.swing.JCheckBox();
        checkAltyazi = new javax.swing.JCheckBox();
        txtSure = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblAfis = new javax.swing.JLabel();
        cmbYonetmen = new javax.swing.JComboBox<>();
        btnAfisEkle = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAciklama = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinnerFiyat = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();

        setTitle("Film Ekle");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formİnternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Film Adı");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 17, 100, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kategori");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 64, 100, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Üç Boyutlu");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 108, 100, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Altyazılı");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 149, 100, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Süre");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 184, 100, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Yönetmen");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 231, 100, 20));

        txtAd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, -1));

        cmbKategori.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, -1));

        checkUcBoyut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(checkUcBoyut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 108, -1, -1));

        checkAltyazi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(checkAltyazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        txtSure.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(txtSure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 178, 150, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dakika");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 181, -1, -1));

        lblAfis.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblAfis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAfis.setOpaque(true);
        getContentPane().add(lblAfis, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 351, 155, 210));

        cmbYonetmen.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbYonetmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYonetmenActionPerformed(evt);
            }
        });
        getContentPane().add(cmbYonetmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 227, 150, -1));

        btnAfisEkle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnAfisEkle.setText("Afiş Ekle");
        btnAfisEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfisEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfisEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 351, -1, -1));

        btnKaydet.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 93, -1));

        txtAciklama.setColumns(20);
        txtAciklama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtAciklama.setLineWrap(true);
        txtAciklama.setRows(15);
        jScrollPane1.setViewportView(txtAciklama);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 270, 230));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Açıklama");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 100, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fiyat");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 291, 100, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TL");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 291, -1, -1));

        spinnerFiyat.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(5.0f), Float.valueOf(5.0f), Float.valueOf(30.0f), Float.valueOf(5.0f)));
        getContentPane().add(spinnerFiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 281, 89, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gazi/gorsel/sinema/img/arsiv.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formİnternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formİnternalFrameOpened
        List<Kategori> list = kbl.KategoriListele();
        List<Yonetmen> listY = ybl.YonetmenListele();
        for (int i = 0; i < list.size(); i++) {
            cmbKategori.addItem(list.get(i).getAd());
        }
        for (int i = 0; i < listY.size(); i++) {
            cmbYonetmen.addItem(listY.get(i).getAdSoyad());
        }
    }//GEN-LAST:event_formİnternalFrameOpened

    private void btnAfisEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfisEkleActionPerformed
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            ImageIcon imageIcon = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(150, 210, java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            lblAfis.setIcon(imageIcon);
        }
    }//GEN-LAST:event_btnAfisEkleActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        FilmBL fbl = new FilmBL();
        Film f = new Film();
        f.setAd(txtAd.getText().trim());
        f.setKategoriId(kbl.KategoriIdGetir(cmbKategori.getSelectedItem().toString()));
        if (checkUcBoyut.isSelected()) {
            f.setUcBoyut(true);
        } else {
            f.setUcBoyut(false);
        }
        if (checkAltyazi.isSelected()) {
            f.setAltyazi(true);
        } else {
            f.setAltyazi(false);
        }
        f.setSure(Integer.parseInt(txtSure.getText().trim()));
        f.setYonetmenId(ybl.YonetmenIdGetir(cmbYonetmen.getSelectedItem().toString()));
        f.setAfis(lblAfis.getIcon());
        f.setAciklama(txtAciklama.getText().trim());
        if (fbl.FilmKayit(f) > 0) {
            JOptionPane.showMessageDialog(null, "Film kayıt işlemi başarılı.");
        }
        f.setFiyat((Float)spinnerFiyat.getValue());
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void cmbYonetmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYonetmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYonetmenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfisEkle;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JCheckBox checkAltyazi;
    private javax.swing.JCheckBox checkUcBoyut;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbYonetmen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAfis;
    private javax.swing.JSpinner spinnerFiyat;
    private javax.swing.JTextArea txtAciklama;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtSure;
    // End of variables declaration//GEN-END:variables
}

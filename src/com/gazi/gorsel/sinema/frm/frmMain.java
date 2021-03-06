/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.sinema.frm;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author emin
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public static int calisanId;
    public static int yetkiId;

    public frmMain() {
        initComponents();
    }

    public frmMain(int id, int yetkiid) {
        initComponents();
        calisanId = id;
        yetkiId = yetkiid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/com/gazi/gorsel/sinema/img/background.jpg"));
        Image img = icon.getImage();
        pnlMain = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuKategori = new javax.swing.JMenu();
        yeniKat = new javax.swing.JMenuItem();
        menuYonetmen = new javax.swing.JMenu();
        yeniYon = new javax.swing.JMenuItem();
        menuFilm = new javax.swing.JMenu();
        yeniFilm = new javax.swing.JMenuItem();
        menuSalon = new javax.swing.JMenu();
        yeniSalon = new javax.swing.JMenuItem();
        menuSeans = new javax.swing.JMenu();
        yeniSeans = new javax.swing.JMenuItem();
        menuSatis = new javax.swing.JMenu();
        menuYeniSatis = new javax.swing.JMenuItem();
        menuSatisListe = new javax.swing.JMenuItem();
        menuCalisan = new javax.swing.JMenu();
        yeniCalisan = new javax.swing.JMenuItem();
        menuHakkinda = new javax.swing.JMenu();
        menuCikis = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinema Otomasyonu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        menuKategori.setText("Kategori İşlemleri");

        yeniKat.setText("Yeni Kategori");
        yeniKat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKatActionPerformed(evt);
            }
        });
        menuKategori.add(yeniKat);

        menuBar.add(menuKategori);

        menuYonetmen.setText("Yönetmen İşlemleri");

        yeniYon.setText("Yeni Yönetmen");
        yeniYon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniYonActionPerformed(evt);
            }
        });
        menuYonetmen.add(yeniYon);

        menuBar.add(menuYonetmen);

        menuFilm.setMnemonic('e');
        menuFilm.setText("Film İşlemleri");

        yeniFilm.setText("Yeni Film");
        yeniFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniFilmActionPerformed(evt);
            }
        });
        menuFilm.add(yeniFilm);

        menuBar.add(menuFilm);

        menuSalon.setMnemonic('h');
        menuSalon.setText("Salon İşlemleri");

        yeniSalon.setMnemonic('c');
        yeniSalon.setText("Yeni Salon");
        yeniSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniSalonActionPerformed(evt);
            }
        });
        menuSalon.add(yeniSalon);

        menuBar.add(menuSalon);

        menuSeans.setText("Seans İşlemleri");

        yeniSeans.setText("Yeni Seans");
        yeniSeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniSeansActionPerformed(evt);
            }
        });
        menuSeans.add(yeniSeans);

        menuBar.add(menuSeans);

        menuSatis.setText("Satış İşlemleri");

        menuYeniSatis.setText("Yeni Satış");
        menuYeniSatis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuYeniSatisActionPerformed(evt);
            }
        });
        menuSatis.add(menuYeniSatis);

        menuSatisListe.setText("Satış Listele");
        menuSatisListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSatisListeActionPerformed(evt);
            }
        });
        menuSatis.add(menuSatisListe);

        menuBar.add(menuSatis);

        menuCalisan.setMnemonic('f');
        menuCalisan.setText("Çalışan İşlemleri");

        yeniCalisan.setMnemonic('o');
        yeniCalisan.setText("Yeni Çalışan");
        yeniCalisan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniCalisanActionPerformed(evt);
            }
        });
        menuCalisan.add(yeniCalisan);

        menuBar.add(menuCalisan);

        menuHakkinda.setText("Hakkında");
        menuBar.add(menuHakkinda);

        menuCikis.setText("Çıkış");
        menuCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCikisMouseClicked(evt);
            }
        });
        menuBar.add(menuCikis);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCikisMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Çıkmak istediğinize emin misiniz?") == JOptionPane.YES_OPTION) {
            frmLogin f = new frmLogin();
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_menuCikisMouseClicked

    private void yeniCalisanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniCalisanActionPerformed
        frmCalisanEkle f = new frmCalisanEkle();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yeniCalisanActionPerformed

    private void yeniKatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKatActionPerformed
        frmKategoriEkle f = new frmKategoriEkle();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
    }//GEN-LAST:event_yeniKatActionPerformed

    private void yeniYonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniYonActionPerformed
        frmYonetmenEkle f = new frmYonetmenEkle();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
    }//GEN-LAST:event_yeniYonActionPerformed

    private void yeniFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniFilmActionPerformed
        frmFilmEkle f = new frmFilmEkle();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
    }//GEN-LAST:event_yeniFilmActionPerformed

    private void yeniSeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniSeansActionPerformed
        frmSeansEkle f = new frmSeansEkle();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
    }//GEN-LAST:event_yeniSeansActionPerformed

    private void yeniSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniSalonActionPerformed
        frmSalonEkle f = new frmSalonEkle();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
    }//GEN-LAST:event_yeniSalonActionPerformed

    private void menuYeniSatisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuYeniSatisActionPerformed
        frmSatisYap f = new frmSatisYap();
        pnlMain.add(f);
        f.setVisible(true);
        f.setClosable(true);
        try {
            f.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuYeniSatisActionPerformed

    private void menuSatisListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSatisListeActionPerformed
        if (yetkiId != 1) {
            JOptionPane.showMessageDialog(null, "Listeleme yetkiniz yok.");
        } else {
            frmSatisListe f = new frmSatisListe();
            pnlMain.add(f);
            f.setVisible(true);
            f.setClosable(true);
            try {
                f.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuSatisListeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCalisan;
    private javax.swing.JMenu menuCikis;
    private javax.swing.JMenu menuFilm;
    private javax.swing.JMenu menuHakkinda;
    private javax.swing.JMenu menuKategori;
    private javax.swing.JMenu menuSalon;
    private javax.swing.JMenu menuSatis;
    private javax.swing.JMenuItem menuSatisListe;
    private javax.swing.JMenu menuSeans;
    private javax.swing.JMenuItem menuYeniSatis;
    private javax.swing.JMenu menuYonetmen;
    private javax.swing.JDesktopPane pnlMain;
    private javax.swing.JMenuItem yeniCalisan;
    private javax.swing.JMenuItem yeniFilm;
    private javax.swing.JMenuItem yeniKat;
    private javax.swing.JMenuItem yeniSalon;
    private javax.swing.JMenuItem yeniSeans;
    private javax.swing.JMenuItem yeniYon;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabila Sukma Abadi
 */
public class Tugas2P2 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas2P2
     */
    public Tugas2P2() {
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
        kolom_angka1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kolom_angka2 = new javax.swing.JTextField();
        kolom_hasil = new javax.swing.JTextField();
        tombol_tambah = new javax.swing.JButton();
        tombol_kurang = new javax.swing.JButton();
        tombol_kali = new javax.swing.JButton();
        tombol_bagi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM KALKULATOR");

        kolom_angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_angka1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HASIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ANGKA 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ANGKA 2");

        kolom_angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_angka2ActionPerformed(evt);
            }
        });

        kolom_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_hasilActionPerformed(evt);
            }
        });

        tombol_tambah.setText("Penjumlahan");
        tombol_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambahActionPerformed(evt);
            }
        });

        tombol_kurang.setText("Pengurangan");
        tombol_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_kurangActionPerformed(evt);
            }
        });

        tombol_kali.setText("Perkalian");
        tombol_kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_kaliActionPerformed(evt);
            }
        });

        tombol_bagi.setText("Pembagian");
        tombol_bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_bagiActionPerformed(evt);
            }
        });

        jLabel5.setText("PROGRAM NABILA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tombol_tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombol_kurang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombol_kali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombol_bagi)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kolom_angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kolom_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kolom_angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolom_angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolom_angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolom_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol_tambah)
                    .addComponent(tombol_kurang)
                    .addComponent(tombol_kali)
                    .addComponent(tombol_bagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolom_angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_angka1ActionPerformed

    private void kolom_angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_angka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_angka2ActionPerformed

    private void kolom_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_hasilActionPerformed
    
    double angka1, angka2, hasil; //Deklarasi Variable
    
    private void tombol_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambahActionPerformed
        angka1 = Double.parseDouble(kolom_angka1.getText().toString()); //Mengkonversi angka1 menjadi type data Double                                              
        angka2 = Double.parseDouble(kolom_angka2.getText().toString()); //Mengkonversi angka2 menjadi type data Double
        hasil = angka1 + angka2; //Membuat hasil
        kolom_hasil.setText(Double.toString(hasil)); //Output ke kolom_hasil
    }//GEN-LAST:event_tombol_tambahActionPerformed

    private void tombol_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_kurangActionPerformed
        angka1 = Double.parseDouble(kolom_angka1.getText().toString()); //Mengkonversi angka1 menjadi type data Double                                              
        angka2 = Double.parseDouble(kolom_angka2.getText().toString()); //Mengkonversi angka2 menjadi type data Double
        hasil = angka1 - angka2; //Membuat hasil
        kolom_hasil.setText(Double.toString(hasil)); //Output ke kolom_hasil
    }//GEN-LAST:event_tombol_kurangActionPerformed

    private void tombol_kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_kaliActionPerformed
        angka1 = Double.parseDouble(kolom_angka1.getText().toString()); //Mengkonversi angka1 menjadi type data Double                                              
        angka2 = Double.parseDouble(kolom_angka2.getText().toString()); //Mengkonversi angka2 menjadi type data Double
        hasil = angka1 * angka2; //Membuat hasil
        kolom_hasil.setText(Double.toString(hasil)); //Output ke kolom_hasil        // TODO add your handling code here:
    }//GEN-LAST:event_tombol_kaliActionPerformed

    private void tombol_bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_bagiActionPerformed
        angka1 = Double.parseDouble(kolom_angka1.getText().toString()); //Mengkonversi angka1 menjadi type data Double                                              
        angka2 = Double.parseDouble(kolom_angka2.getText().toString()); //Mengkonversi angka2 menjadi type data Double
        hasil = angka1 / angka2; //Membuat hasil
        kolom_hasil.setText(Double.toString(hasil)); //Output ke kolom_hasil
    }//GEN-LAST:event_tombol_bagiActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas2P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas2P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas2P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas2P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas2P2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kolom_angka1;
    private javax.swing.JTextField kolom_angka2;
    private javax.swing.JTextField kolom_hasil;
    private javax.swing.JButton tombol_bagi;
    private javax.swing.JButton tombol_kali;
    private javax.swing.JButton tombol_kurang;
    private javax.swing.JButton tombol_tambah;
    // End of variables declaration//GEN-END:variables
}
